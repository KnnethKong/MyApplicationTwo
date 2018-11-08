package com.kxf.two.delegate;

import android.support.v4.widget.SwipeRefreshLayout;

import com.kxf.base.delegate.BaseListDelegate;
import com.kxf.two.R;
import com.kxf.two.widget.EmptyLayout;


/**
 * @author kymjs (http://www.kymjs.com/) on 11/27/15.
 */
public class PullListDelegate extends BaseListDelegate {

    public EmptyLayout mEmptyLayout;

    @Override
    public void initWidget() {
        super.initWidget();
        mEmptyLayout = new EmptyLayout(getActivity());
        setEmptyLayout(mEmptyLayout);
    }

    public void setOnRefreshListener(SwipeRefreshLayout.OnRefreshListener l) {
        SwipeRefreshLayout swipeRefreshLayout = get(R.id.swiperefreshlayout);
        swipeRefreshLayout.setOnRefreshListener(l);
    }
}
