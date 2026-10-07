package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jn6 implements kq4, gv9, tg4 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jn6(o4c o4cVar, boolean z, LinkedHashSet linkedHashSet) {
        this.b = o4cVar;
        this.a = z;
        this.c = linkedHashSet;
    }

    @Override // defpackage.tg4
    public void accept(Object obj) {
        long jV;
        int i;
        o4c o4cVar = (o4c) this.b;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
        voh vohVar = (voh) obj;
        String strSubstring = vohVar.c;
        List arrayList = null;
        for (vg4 vg4Var : ((no4) o4cVar.e.getValue()).a.b.values()) {
            if (TextUtils.equals(strSubstring, vg4Var.r())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(vg4Var);
            }
        }
        if (arrayList == null) {
            arrayList = Collections.EMPTY_LIST;
        }
        if (arrayList.size() == 1) {
            jV = ((vg4) arrayList.get(0)).v();
            strSubstring = null;
        } else {
            if (this.a || strSubstring.length() <= 1) {
                strSubstring = null;
            } else {
                if (linkedHashSet.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it = linkedHashSet.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        String str = ((cga) it.next()).b;
                        if (str != null && str.length() != 0 && (i = i + 1) < 0) {
                            xw3.U0();
                            throw null;
                        }
                    }
                }
                if (i >= ((Number) ((g5d) ((gjf) o4cVar.f.getValue())).a.R.a(e5d.S6[36]).i()).intValue()) {
                    return;
                }
                if (strSubstring.charAt(0) == '@') {
                    strSubstring = strSubstring.substring(1);
                }
            }
            jV = 0;
        }
        if (jV == 0 && (strSubstring == null || strSubstring.length() == 0)) {
            return;
        }
        String str2 = (strSubstring == null || strSubstring.length() == 0) ? null : strSubstring;
        int i2 = vohVar.a;
        linkedHashSet.add(new cga(jV, str2, bga.a, i2, vohVar.b - i2, null));
    }

    @Override // defpackage.gv9
    public void c(e38 e38Var, int i) {
        e38Var.E(((jv9) this.b).c, i, ((p70) this.c).d(), this.a);
    }

    @Override // defpackage.kq4
    public Object h(Task task) {
        return ((Integer) task.h()).intValue() != 402 ? task : kzi.m((Context) this.b, (Intent) this.c, this.a).l(new sv(1), new o75(27));
    }

    public /* synthetic */ jn6(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.c = obj2;
        this.a = z;
    }
}
