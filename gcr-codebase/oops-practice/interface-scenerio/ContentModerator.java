interface TextModeration {

    boolean checkOffensiveContent(String post);

    default void displayModerationPolicy() {
        System.out.println("No offensive language allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        String lower = post.toLowerCase();

        return lower.contains("hate")
                || lower.contains("abuse")
                || lower.contains("stupid");
    }
}

interface SpamDetection {

    boolean checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Spam content is prohibited.");
    }
}

public class ContentModerator
        implements TextModeration, SpamDetection {

    @Override
    public boolean checkOffensiveContent(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    @Override
    public boolean checkSpam(String post) {
        String lower = post.toLowerCase();

        return lower.contains("buy now")
                || lower.contains("click here")
                || lower.contains("free money");
    }

    // Resolving default method conflict
    @Override
    public void displayModerationPolicy() {
        System.out.println("Content Moderation Policies:");

        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }

    public static void main(String[] args) {

        String[] posts = {
                "I love learning Java.",
                "Buy now and get 50% off!",
                "You are stupid.",
                "Click here to win free money.",
                "Have a great day everyone!"
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();

        System.out.println();

        for (String post : posts) {

            if (moderator.checkSpam(post)) {
                System.out.println("SPAM POST -> " + post);
            }
            else if (moderator.checkOffensiveContent(post)) {
                System.out.println("OFFENSIVE POST -> " + post);
            }
            else {
                System.out.println("VALID POST -> " + post);
            }
        }
    }
}