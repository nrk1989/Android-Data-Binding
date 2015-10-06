/**
 * SimpleListAdapter.java
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

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.raj.androiddatabinding.BR;

import java.util.List;

/**
 * Created by Rajkumar.N on 30-Sep-15.
 */
public class SimpleListAdapter extends RecyclerView.Adapter<SimpleListAdapter.BindingHolder> {

    private List<Contact> mContacts;

    public SimpleListAdapter(List<Contact> contacts) {
        this.mContacts = contacts;
    }

    @Override
    public BindingHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_contact, viewGroup, false);
        BindingHolder holder = new BindingHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(BindingHolder bindingHolder, int position) {
        final Contact contact = mContacts.get(position);
        bindingHolder.getBinding().setVariable(BR.contact, contact);
        bindingHolder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }

    public static class BindingHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding binding;

        public BindingHolder(View v) {
            super(v);
            binding = DataBindingUtil.bind(v);
        }

        public ViewDataBinding getBinding() {
            return binding;
        }
    }
}
