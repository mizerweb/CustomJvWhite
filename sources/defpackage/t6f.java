package defpackage;

import android.net.Uri;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class t6f {
    public static final t6f c = new t6f(n7g.d, uo.e);
    public final uo a;
    public final n7g b;

    public t6f(n7g n7gVar, uo uoVar) {
        this.b = n7gVar;
        this.a = uoVar;
    }

    public final Uri a() {
        n7g n7gVar = this.b;
        int iBinarySearch = Arrays.binarySearch(n7gVar.a, "api");
        return (Uri) (iBinarySearch < 0 ? null : n7gVar.b[iBinarySearch]);
    }

    public final t6f b(String str) {
        uo uoVar = this.a;
        return Objects.equals(str, uoVar.a) ? this : new t6f(this.b, uoVar.d(str));
    }

    public final t6f c(String str) {
        uo uoVar = this.a;
        if (Objects.equals(str, uoVar.c)) {
            return this;
        }
        return new t6f(this.b, uoVar.e(str, ""));
    }

    public final t6f d(Uri uri) {
        n7g n7gVar;
        n7g n7gVar2 = this.b;
        int i = n7gVar2.c;
        Comparable[] comparableArr = n7gVar2.a;
        Object[] objArr = n7gVar2.b;
        int iBinarySearch = Arrays.binarySearch(comparableArr, "api");
        if (iBinarySearch < 0) {
            int i2 = -iBinarySearch;
            int i3 = i2 - 1;
            int i4 = i + 1;
            Comparable[] comparableArr2 = (Comparable[]) Array.newInstance(comparableArr.getClass().getComponentType(), i4);
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4);
            System.arraycopy(comparableArr, 0, comparableArr2, 0, i3);
            comparableArr2[i3] = "api";
            System.arraycopy(comparableArr, i3, comparableArr2, i2, comparableArr.length - i3);
            System.arraycopy(objArr, 0, objArr2, 0, i3);
            objArr2[i3] = uri;
            System.arraycopy(objArr, i3, objArr2, i2, objArr.length - i3);
            n7gVar = new n7g(comparableArr2, objArr2);
        } else if (Objects.equals(objArr[iBinarySearch], uri)) {
            n7gVar = n7gVar2;
        } else {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iBinarySearch] = uri;
            n7gVar = new n7g(comparableArr, objArrCopyOf);
        }
        return n7gVar == n7gVar2 ? this : new t6f(n7gVar, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t6f.class != obj.getClass()) {
            return false;
        }
        t6f t6fVar = (t6f) obj;
        return this.a.equals(t6fVar.a) && this.b.equals(t6fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SdkApiConfig{apiConfig=" + this.a + ", uris=" + this.b + '}';
    }
}
