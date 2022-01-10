package PracticeAlgorithms1;

public class MaxNumOfWordsFoundInSentences {

//    A sentence is a list of words that are separated by a single space
//    with no leading or trailing spaces.
//
//    You are given an array of strings sentences, where each sentences[i]
//    represents a single sentence.
//
//    Return the maximum number of words that appear in a single sentence.


    public int mostWordsFound(String[] sentences) {

        int count = 0;

            for (String x : sentences) {
                int length = x.split(" ").length;

                count = Integer.max(count, length);
            }

        return count;

    }
}
