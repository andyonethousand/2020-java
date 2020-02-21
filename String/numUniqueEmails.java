
class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> seen = new HashSet();
        for (String email : emails) {
            int index_at = email.indexOf('@');
            String local = email.substring(0, index_at);
            // Substring with one parameter returns substring from index to
            // end of the string
            String domain = email.substring(index_at);
            
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf("+"));
            }
            
            // need the slashes bc . means any character I think
            local = local.replaceAll("\\.", "");
            seen.add(local + domain);
        }
        
        return seen.size();
    }
}
