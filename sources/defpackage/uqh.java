package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class uqh {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(uqh.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public qc6[] a;

    public final void a(qc6 qc6Var) {
        qc6Var.d((rc6) this);
        qc6[] qc6VarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (qc6VarArr == null) {
            qc6VarArr = new qc6[4];
            this.a = qc6VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= qc6VarArr.length) {
            qc6VarArr = (qc6[]) Arrays.copyOf(qc6VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = qc6VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        qc6VarArr[i] = qc6Var;
        qc6Var.b = i;
        while (i > 0) {
            Object[] objArr = this.a;
            int i2 = (i - 1) / 2;
            if (objArr[i2].compareTo(objArr[i]) <= 0) {
                return;
            }
            c(i, i2);
            i = i2;
        }
    }

    public final qc6 b(int i) {
        Object[] objArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            c(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i <= 0 || objArr[i].compareTo(objArr[i2]) >= 0) {
                while (true) {
                    int i3 = i * 2;
                    int i4 = i3 + 1;
                    if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                    }
                    Object[] objArr2 = this.a;
                    int i5 = i3 + 2;
                    if (i5 >= atomicIntegerFieldUpdater.get(this) || objArr2[i5].compareTo(objArr2[i4]) >= 0) {
                        i5 = i4;
                    }
                    if (objArr2[i].compareTo(objArr2[i5]) <= 0) {
                        break;
                    }
                    c(i, i5);
                    i = i5;
                }
            } else {
                c(i, i2);
                while (i2 > 0) {
                    Object[] objArr3 = this.a;
                    int i6 = (i2 - 1) / 2;
                    if (objArr3[i6].compareTo(objArr3[i2]) <= 0) {
                        break;
                    }
                    c(i2, i6);
                    i2 = i6;
                }
            }
        }
        qc6 qc6Var = objArr[atomicIntegerFieldUpdater.get(this)];
        qc6Var.d(null);
        qc6Var.b = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return qc6Var;
    }

    public final void c(int i, int i2) {
        qc6[] qc6VarArr = this.a;
        qc6 qc6Var = qc6VarArr[i2];
        qc6 qc6Var2 = qc6VarArr[i];
        qc6VarArr[i] = qc6Var;
        qc6VarArr[i2] = qc6Var2;
        qc6Var.b = i;
        qc6Var2.b = i2;
    }
}
