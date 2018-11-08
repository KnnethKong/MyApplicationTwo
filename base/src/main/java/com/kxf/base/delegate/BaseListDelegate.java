package com.kxf.base.delegate;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;

import com.kxf.base.R;
import com.kymjs.frame.view.AppDelegate;


/**
 * 列表基类视图
 *
 * @author kymjs (http://www.kymjs.com/) on 11/27/15.
 */
public class BaseListDelegate extends AppDelegate {

    protected RecyclerView mRecyclerView;

    @Override
    public int getRootLayoutId() {
        return R.layout.base_list_delegate;
    }

    @Override
    public void initWidget() {
        super.initWidget();
        SwipeRefreshLayout refreshLayout = get(R.id.swiperefreshlayout);
        refreshLayout.setColorSchemeResources(R.color.base_swiperefresh_color1,
                R.color.base_swiperefresh_color2,
                R.color.base_swiperefresh_color3,
                R.color.base_swiperefresh_color4);

        mRecyclerView = get(R.id.recyclerView);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayoutManager.VERTICAL, false));
    }

    protected void setEmptyLayout(View emptyLayout) {
        FrameLayout layout = get(R.id.emptyLayoutParent);
        layout.addView(emptyLayout);
    }

    public void setSwipeRefreshLoadingState() {
        SwipeRefreshLayout refreshLayout = get(R.id.swiperefreshlayout);
        refreshLayout.setRefreshing(true);
        refreshLayout.setEnabled(false);
    }

    public void setSwipeRefreshLoadedState() {
        SwipeRefreshLayout refreshLayout = get(R.id.swiperefreshlayout);
        refreshLayout.setRefreshing(false);
        refreshLayout.setEnabled(true);
    }

    public LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) mRecyclerView.getLayoutManager();
    }

}
