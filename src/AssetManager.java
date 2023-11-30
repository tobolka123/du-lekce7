import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class AssetManager extends ArrayList<Asset> {
    @Override
    public String toString() {
        StringBuilder response = new StringBuilder("AssetsManager: ");
        forEach(asset -> response.append("* ").append(asset).append(" -> ").append(asset.getLokace()).append("\n"));
        return response.toString();
    }
}
