package defpackage;

import java.util.RandomAccess;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class qw extends b2 implements RandomAccess {
    public final /* synthetic */ int[] a;

    public qw(int[] iArr) {
        this.a = iArr;
    }

    @Override // defpackage.b2, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            return a.L0(((Number) obj).intValue(), this.a);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Integer.valueOf(this.a[i]);
    }

    @Override // defpackage.b2
    public final int getSize() {
        return this.a.length;
    }

    @Override // defpackage.b2, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.a;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (iIntValue == iArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.b2, java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.length == 0;
    }

    @Override // defpackage.b2, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int iIntValue = ((Number) obj).intValue();
            int[] iArr = this.a;
            int length = iArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (iIntValue == iArr[length]) {
                        return length;
                    }
                    if (i >= 0) {
                        length = i;
                    }
                }
            }
        }
        return -1;
    }
}
