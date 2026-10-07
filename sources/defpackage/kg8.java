package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class kg8 implements kw8 {
    public final ArrayList a;
    public final String b;

    public kg8(jg8 jg8Var) {
        this.a = jg8Var.a;
        this.b = jg8Var.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(kw8 kw8Var) {
        if (kw8Var != null) {
            kg8 kg8Var = (kg8) kw8Var;
            if (ch3.a(kg8Var.b, this.b)) {
                ArrayList arrayList = kg8Var.a;
                ArrayList arrayList2 = this.a;
                if (arrayList2.size() == arrayList.size()) {
                    for (int i = 0; i < arrayList2.size(); i++) {
                        h61 h61Var = (h61) arrayList2.get(i);
                        if (h61Var.size() == ((h61) arrayList.get(i)).size()) {
                            for (int i2 = 0; i2 < h61Var.size(); i2++) {
                                if (((c61) h61Var.get(i2)).equals(((h61) arrayList.get(i)).get(i2))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
