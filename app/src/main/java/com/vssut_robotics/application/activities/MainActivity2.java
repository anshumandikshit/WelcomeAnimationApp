package com.vssut_robotics.application.activities;

import android.content.Intent;
import android.os.Bundle;

import com.vssut_robotics.application.R;

public class MainActivity2 extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);


        startActivity(new Intent(MainActivity2.this,FoldableListActivity.class));
    }

   /* @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ActivityInfo info = (ActivityInfo) parent.getItemAtPosition(position);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this, info.name));
        startActivity(intent);
    }

    private BaseAdapter getSampleAdapter() {
        List<ActivityInfo> item1 = new ArrayList<>();

        try {
            ActivityInfo[] activitiesInfo = getPackageManager()
                    .getPackageInfo(getPackageName(), PackageManager.GET_ACTIVITIES).activities;

            for (ActivityInfo info : activitiesInfo) {
                if (!getClass().getName().equals(info.name)) {
                    item1.add(info);
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        return new SampleAdapter(this, item1);
    }

    private static class SampleAdapter extends ItemsAdapter<ActivityInfo> {

        SampleAdapter(Context context, List<ActivityInfo> list) {
            super(context);
            setItemsList(list);
        }

        @Override
        protected View createView(ActivityInfo item, int pos, ViewGroup parent,
                                  LayoutInflater inflater) {
            return inflater.inflate(android.R.layout.simple_list_item_1, parent, false);
        }

        @Override
        protected void bindView(ActivityInfo item, int pos, View convertView) {
            TextView tv = (TextView) convertView;
            if (TextUtils.isEmpty(item.nonLocalizedLabel)) {
                //tv.setText(item.labelRes);
            } else {
                tv.setText(item.nonLocalizedLabel);
            }
        }

    }*/

}