package org.qii.weiciyuan.support.lib;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * User: qii
 * Date: 14-6-18
 */
public class HeaderListView extends ListView {

    private ArrayList<View> headerList = new ArrayList<View>();

    public HeaderListView(Context context) {
        super(context);
    }

    public HeaderListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HeaderListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


    @Override
    public void addHeaderView(View v, Object data, boolean isSelectable) {
        super.addHeaderView(v, data, isSelectable);
        headerList.add(v);
    }

    @Override
    public boolean removeHeaderView(View v) {
        boolean result = super.removeHeaderView(v);
        headerList.remove(v);
        return result;
    }

    public boolean isThisViewHeader(View v) {
        return headerList.contains(v);
    }
}
