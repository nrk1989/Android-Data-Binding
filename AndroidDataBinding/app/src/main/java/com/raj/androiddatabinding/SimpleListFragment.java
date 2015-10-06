/**
 * SimpleListFragment.java
 * <p/>
 * Comment
 *
 * @category Demo
 * @package com.raj.androiddatabinding
 * @version 1.0
 * @author Rajkumar.N
 * @license http://www.apache.org/licenses/LICENSE-2.0
 */
package com.raj.androiddatabinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.raj.androiddatabinding.databinding.FragmentListBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajkumar.N on 30-Sep-15.
 */
public class SimpleListFragment extends Fragment {

    private static final String TAG = SimpleListFragment.class.getSimpleName();

    private FragmentListBinding mBinding;
    private CharSequence mTitle;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mTitle = getActivity().getString(R.string.simple_list_data);
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_list, container, false);

        // Demo contacts
        final List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact("Raj", "9043738888", "043741234"));
        contactList.add(new Contact("Vijay", "9043738888", "043741234"));
        contactList.add(new Contact("Saravanan", "9043738888", "043741234"));
        contactList.add(new Contact("Selva", "9043738888", "043741234"));
        contactList.add(new Contact("Ram", "9043738888", "043741234"));
        contactList.add(new Contact("Gopal", "9043738888", "043741234"));
        contactList.add(new Contact("Guru", "9043738888", "043741234"));
        mBinding.contactRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mBinding.contactRecyclerView.setAdapter(new SimpleListAdapter(contactList));
        mBinding.contactRecyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL_LIST));
        return mBinding.getRoot();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        ((MainActivity) getActivity()).onSectionAttached(2);
    }
}
