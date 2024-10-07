// 1813. Sentence Similarity III
// Solved
// Medium
// Topics
// Companies
// Hint
// You are given two strings sentence1 and sentence2, each representing a sentence composed of words. A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of only uppercase and lowercase English characters.

// Two sentences s1 and s2 are considered similar if it is possible to insert an arbitrary sentence (possibly empty) inside one of these sentences such that the two sentences become equal. Note that the inserted sentence must be separated from existing words by spaces.
// .............................................................................................................


public class SentenceSimilarity {
    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");

        if (words1.length < words2.length) {
            String[] temp = words1;
            words1 = words2;
            words2 = temp;
        }

        int l = 0, r = 0;
        int n1 = words1.length, n2 = words2.length;

        while (l < n2 && words1[l].equals(words2[l])) {
            l++;
        }

        while (r < n2 && words1[n1 - r - 1].equals(words2[n2 - r- 1])) {
            r++;
        }
        return l + r >= n2;
    
    
    }
    public static void main(String[] args) {
        String sentence1 = "Hello Jane";
        String sentence2 = "Hello my name is Jane";
        System.out.println(areSentencesSimilar(sentence1,sentence2));
        // sentence1 = "Eating right now"
        //  sentence2 = "Eating"
        //check if word1 == new word made  by word2

    }
}
