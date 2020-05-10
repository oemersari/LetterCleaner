package normal;

import java.nio.charset.StandardCharsets;

public class Clean {

    public String clean(String _source) {
        _source = _source.replaceAll("&#8217;", "'");
        _source = _source.replaceAll("&#8211;", "-");
        _source = _source.replaceAll("&quot;", "");
        _source = _source.replaceAll("&#039;", "'");
        _source = _source.replaceAll("&#39;", "'");
        _source = _source.replaceAll("&#8220;", "„");
        _source = _source.replaceAll("&#8221;", "“");
        byte[] a = _source.getBytes();
        try {
            _source = new String(a, StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return _source;
    }
}

