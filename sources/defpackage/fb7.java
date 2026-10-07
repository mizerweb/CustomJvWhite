package defpackage;

import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class fb7 implements eb7 {
    public final int a;
    public final /* synthetic */ c b;

    public fb7(c cVar, int i) {
        this.b = cVar;
        this.a = i;
    }

    @Override // defpackage.eb7
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        c cVar = this.b;
        a aVar = cVar.y;
        int i = this.a;
        if (aVar == null || i >= 0 || !aVar.i().T(-1, 0)) {
            return cVar.U(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
