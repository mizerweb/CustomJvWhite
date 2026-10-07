package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class m79 extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ n79 b;

    public m79(n79 n79Var) {
        this.b = n79Var;
        a();
    }

    public final void a() {
        yba ybaVar = this.b.c;
        cca ccaVar = ybaVar.v;
        if (ccaVar != null) {
            ybaVar.j();
            ArrayList arrayList = ybaVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((cca) arrayList.get(i)) == ccaVar) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b */
    public final cca getItem(int i) {
        yba ybaVar = this.b.c;
        ybaVar.j();
        ArrayList arrayList = ybaVar.j;
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (cca) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        yba ybaVar = this.b.c;
        ybaVar.j();
        int size = ybaVar.j.size();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((qca) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
