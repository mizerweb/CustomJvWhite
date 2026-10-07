package defpackage;

import java.util.ArrayList;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class x47 implements q47 {
    public final ArrayList a;
    public final long b = R.id.oneme_folder_widget_section_id;

    public x47(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.b;
    }

    @Override // defpackage.k79
    public final int j() {
        return R.id.oneme_folder_widget_section_view_type;
    }
}
