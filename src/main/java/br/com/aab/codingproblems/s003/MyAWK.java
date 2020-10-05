package br.com.aab.codingproblems.s003;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyAWK {
    private String pattern;
    private String toSearch;

    public MyAWK(String pattern, String toSearch) {
        this.pattern = pattern;
        this.toSearch = toSearch;
    }

    public MatcherResponse findPattern() {
        Pattern pattern = Pattern.compile(this.pattern);
        Matcher matcher = pattern.matcher(this.toSearch);
        MatcherResponse matcherResponse = null;
        if (matcher.find()) {
            matcherResponse.setGroup(matcher.group());
            matcherResponse.setStart(matcher.start());
            matcherResponse.setEnd(matcher.end());
        }
        return matcherResponse;
    }

    class MatcherResponse {
        private String group;
        private int start;
        private int end;

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }
    }
}
