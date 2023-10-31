package demo5;

import java.util.ArrayList;
import java.util.List;

public class TextFilterPipeline {
    private List<TextFilter> filters = new ArrayList<>();

    public TextFilterPipeline addFilter(TextFilter filter) {
        filters.add(filter);
        return this;
    }

    public String execute(String text) {
        for (TextFilter filter : filters) {
            text = filter.filter(text);
        }
        return text;
    }
}
