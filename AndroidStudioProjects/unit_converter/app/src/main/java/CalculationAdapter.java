import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.github.ivbaranov.mli.MaterialLetterIcon;
import java.util.List;
import java.util.Random;
import elearning.chidi.com.elearning.R;
public class CalculationAdapter extends BaseAdapter {
    private LayoutInflater lInflater;
    private List<String> listStorage;
    private final TypedValue mTypedValue = new TypedValue();
    private int mBackground;
    private List<String> mValues;
    private int[] mMaterialColors;
    private int mType;
    private Context context;
    private static final Random RANDOM = new Random();
    public CalculationAdapter(Context context, List<String> customizedListView) {
        lInflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.context = context;
        listStorage = customizedListView;
    }
    @Override
    public int getCount() {
        return listStorage.size();
    }
    @Override
    public Object getItem(int position) {
        return listStorage.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder listViewHolder;
        if(convertView == null){
            listViewHolder = new ViewHolder();
            convertView = lInflater.inflate(R.layout.calculation_list, parent, false);
            listViewHolder.calculationText = (TextView)convertView.findViewById(R.id.navigation_name);
            //listViewHolder.letterIcon = (MaterialLetterIcon)convertView.findViewById(R.id.imageView);
            convertView.setTag(listViewHolder);
        }else{
            listViewHolder = (ViewHolder) convertView.getTag();
        }
        mMaterialColors = context.getResources().getIntArray(R.array.colors);
        mBackground = mTypedValue.resourceId;
        mValues = this.listStorage;
        listViewHolder.calculationText.setText(listStorage.get(position));

        return convertView;
    }
    static class ViewHolder{
        TextView calculationText;
        //MaterialLetterIcon letterIcon;
    }
}