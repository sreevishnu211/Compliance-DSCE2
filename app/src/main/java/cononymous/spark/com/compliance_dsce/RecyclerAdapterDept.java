package cononymous.spark.com.compliance_dsce;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Spark on 3/5/2017.
 */

public class RecyclerAdapterDept extends RecyclerView.Adapter<RecyclerAdapterDept.ViewHolder> {


    public RecyclerAdapterDept(){

    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView dept_name;
        public ViewHolder(View itemView) {
            super(itemView);
            dept_name = (TextView) itemView.findViewById(R.id.dept_name);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_dept,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }
}
