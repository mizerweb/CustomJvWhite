package defpackage;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool$InvalidSizeException;

/* JADX INFO: loaded from: classes.dex */
public abstract class waa extends cs0 {
    public final int[] j;

    public waa(uba ubaVar, cbd cbdVar, dbd dbdVar) {
        super(ubaVar, cbdVar, dbdVar);
        SparseIntArray sparseIntArray = cbdVar.c;
        sparseIntArray.getClass();
        this.j = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.j;
            if (i >= iArr.length) {
                this.b.a(this);
                this.i.getClass();
                return;
            } else {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            }
        }
    }

    @Override // defpackage.cs0
    public final void h(Object obj) {
        vaa vaaVar = (vaa) obj;
        vaaVar.getClass();
        vaaVar.close();
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
        vaa vaaVar = (vaa) obj;
        vaaVar.getClass();
        return vaaVar.getSize();
    }

    @Override // defpackage.cs0
    public final int l(int i) {
        return i;
    }

    @Override // defpackage.cs0
    public final boolean o(Object obj) {
        vaa vaaVar = (vaa) obj;
        vaaVar.getClass();
        return !vaaVar.isClosed();
    }
}
