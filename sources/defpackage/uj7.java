package defpackage;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool$InvalidSizeException;

/* JADX INFO: loaded from: classes.dex */
public class uj7 extends cs0 {
    public final int[] j;

    public uj7(uba ubaVar, cbd cbdVar, nhb nhbVar) {
        super(ubaVar, cbdVar, nhbVar);
        SparseIntArray sparseIntArray = cbdVar.c;
        if (sparseIntArray != null) {
            this.j = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i = 0; i < size; i++) {
                this.j[i] = sparseIntArray.keyAt(i);
            }
        } else {
            this.j = new int[0];
        }
        this.b.a(this);
        this.i.getClass();
    }

    @Override // defpackage.cs0
    public final Object f(int i) {
        return new byte[i];
    }

    @Override // defpackage.cs0
    public final /* bridge */ /* synthetic */ void h(Object obj) {
    }

    @Override // defpackage.cs0
    public final int j(int i) {
        if (i <= 0) {
            throw new BasePool$InvalidSizeException(Integer.valueOf(i));
        }
        for (int i2 : this.j) {
            if (i2 >= i) {
                return i2;
            }
        }
        return i;
    }

    @Override // defpackage.cs0
    public final int k(Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // defpackage.cs0
    public final int l(int i) {
        return i;
    }
}
