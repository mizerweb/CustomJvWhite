package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class w74 implements ko5, lo5 {
    public jr3 a;
    public volatile boolean b;

    public static void e(jr3 jr3Var) {
        if (jr3Var == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : (Object[]) jr3Var.d) {
            if (obj instanceof ko5) {
                try {
                    ((ko5) obj).dispose();
                } catch (Throwable th) {
                    iwl.a(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw gd6.b((Throwable) arrayList.get(0));
        }
    }

    @Override // defpackage.lo5
    public final boolean a(ko5 ko5Var) {
        Objects.requireNonNull(ko5Var, "disposable is null");
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        jr3 jr3Var = this.a;
                        if (jr3Var == null) {
                            jr3Var = new jr3();
                            int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                            jr3Var.a = iNumberOfLeadingZeros - 1;
                            jr3Var.c = (int) (0.75f * iNumberOfLeadingZeros);
                            jr3Var.d = new Object[iNumberOfLeadingZeros];
                            this.a = jr3Var;
                        }
                        jr3Var.b(ko5Var);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ko5Var.dispose();
        return false;
    }

    @Override // defpackage.lo5
    public final boolean b(ko5 ko5Var) {
        if (!c(ko5Var)) {
            return false;
        }
        ko5Var.dispose();
        return true;
    }

    @Override // defpackage.lo5
    public final boolean c(ko5 ko5Var) {
        Object obj;
        if (this.b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return false;
                }
                jr3 jr3Var = this.a;
                if (jr3Var != null) {
                    Object[] objArr = (Object[]) jr3Var.d;
                    int i = jr3Var.a;
                    int iHashCode = ko5Var.hashCode() * (-1640531527);
                    int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
                    Object obj2 = objArr[i2];
                    if (obj2 != null) {
                        if (obj2.equals(ko5Var)) {
                            jr3Var.d(objArr, i2, i);
                        } else {
                            do {
                                i2 = (i2 + 1) & i;
                                obj = objArr[i2];
                                if (obj == null) {
                                }
                            } while (!obj.equals(ko5Var));
                            jr3Var.d(objArr, i2, i);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return;
                }
                jr3 jr3Var = this.a;
                this.a = null;
                e(jr3Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ko5
    public final void dispose() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return;
                }
                this.b = true;
                jr3 jr3Var = this.a;
                this.a = null;
                e(jr3Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
