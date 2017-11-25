package com.happybirthday;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class HappyBirthDay extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy_birth_day);

        setListAdapter(
                new SimpleAdapter(
                        this, getData(), android.R.layout.simple_list_item_1, new String[]{"title"},
                        new int[]{android.R.id.text1}
                )
        );
        getListView().setScrollbarFadingEnabled(false);
    }


    @SuppressWarnings("unchecked")
    @Override
    protected void onListItemClick(uListView l, View v, int position, long id) {
        Map<String, Object> map = (Map<String, Object>) l.getItemAtPosition(position);
        Intent intent = new Intent(this, (Class<? extends Activity>) map.get("activity"));
        startActivity(intent);
    }

    private List<? extends Map<String, ?>> getData() {
        List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
        addItem(data, "TextViews", FlipTextViewActivity.class);
        addItem(data, "Buttons", FlipButtonActivity.class);
        addItem(data, "Complex Layouts", FlipComplexLayoutActivity.class);
        addItem(data, "Async Content", FlipAsyncContentActivity.class);
        addItem(data, "Event Listener", FlipTextViewAltActivity.class);
        addItem(data, "Horizontal", FlipHorizontalLayoutActivity.class);
        addItem(data, "Issue #5", Issue5Activity.class);
        addItem(data, "XML Configuration", FlipTextViewXmlActivity.class);
        addItem(data, "Fragment", FlipFragmentActivity.class);
        addItem(data, "Dynamic Adapter Size", FlipDynamicAdapterActivity.class);
        addItem(data, "WebView", FlipWebViewActivity.class);
        addItem(data, "Delete page", FlipDeleteAdapterActivity.class);
        addItem(data, "Issue #51", Issue51Activity.class);
        return data;
    }

    private void addItem(List<Map<String, Object>> data, String title,
                         Class<? extends Activity> activityClass) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("title", data.size() + ". " + title);
        map.put("activity", activityClass);
        data.add(map);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_happy_birth_day, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
