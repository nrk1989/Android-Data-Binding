/**
 * SimpleFragment.java
 * <p/>
 * A fragment used to demonstrates the simple binding concept.
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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.raj.androiddatabinding.databinding.FragmentSimpleBinding;

/**
 * Created by Rajkumar.N on 30-Sep-15.
 */
public class SimpleFragment extends Fragment {

    private static final String TAG = SimpleFragment.class.getSimpleName();

    private FragmentSimpleBinding mBinding;
    private CharSequence mTitle;
    private final Contact contact = new Contact();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_simple, container, false);
        contact.setName("Raj");
        contact.setMobileNumber("9043748885");
        contact.setWorkNumber("043140561");
        contact.setAge(18);
        mBinding.setContact(contact);
        mTitle = getActivity().getTitle();
        mTitle = "Simple Data Binding";

        mBinding.name.setText("Name");
        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Updates the contact details
        contact.setName("Rajkumar");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        ((MainActivity) getActivity()).onSectionAttached(1);
    }
}

