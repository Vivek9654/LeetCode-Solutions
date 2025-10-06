
import java.util.*;

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        
        List<String> result = new ArrayList<>();
        result.add(folder[0]);

        for (int i = 1; i < folder.length; i++) {
            String currentFolder = folder[i];
            String lastParent = result.get(result.size() - 1);

            if (!currentFolder.startsWith(lastParent + "/")) {
                result.add(currentFolder);
            }
        }
        
        return result;
    }
}