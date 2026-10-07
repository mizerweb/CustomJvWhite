package defpackage;

import android.util.SparseBooleanArray;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class g2a {
    public static final fmf e;
    public static final h3d f;
    public final fmf a;
    public final h3d b;
    public final c98 c;
    public final c98 d;

    static {
        HashSet hashSet = new HashSet();
        ghe gheVar = emf.d;
        for (int i = 0; i < gheVar.d; i++) {
            hashSet.add(new emf(((Integer) gheVar.get(i)).intValue()));
        }
        e = new fmf(hashSet);
        HashSet hashSet2 = new HashSet();
        ghe gheVar2 = emf.e;
        for (int i2 = 0; i2 < gheVar2.d; i2++) {
            hashSet2.add(new emf(((Integer) gheVar2.get(i2)).intValue()));
        }
        for (int i3 = 0; i3 < gheVar.d; i3++) {
            hashSet2.add(new emf(((Integer) gheVar.get(i3)).intValue()));
        }
        new fmf(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i4 : p3c.c) {
            lvb.b0(!false);
            sparseBooleanArray.append(i4, true);
        }
        lvb.b0(!false);
        f = new h3d(new cx6(sparseBooleanArray));
    }

    public g2a(fmf fmfVar, h3d h3dVar, c98 c98Var, c98 c98Var2) {
        this.a = fmfVar;
        this.b = h3dVar;
        this.c = c98Var;
        this.d = c98Var2;
    }
}
