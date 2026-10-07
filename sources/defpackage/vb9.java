package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class vb9 {
    private final String a;
    private final String b;
    private final Uri c;
    private final boolean d;

    public static class a {
        private String a = null;
        private String b = null;
        private Uri c = null;
        private boolean d = false;

        public vb9 a() {
            String str = this.a;
            boolean z = true;
            if ((str == null || this.b != null || this.c != null) && ((str != null || this.b == null || this.c != null) && (str != null || this.b != null || this.c == null))) {
                z = false;
            }
            yab.n("Set one of filePath, assetFilePath and URI.", z);
            return new vb9(this.a, this.b, this.c, this.d, null);
        }

        public a b(String str) {
            yab.q(str, "Model Source file path can not be empty");
            boolean z = false;
            if (this.b == null && this.c == null && !this.d) {
                z = true;
            }
            yab.n("A local model source is from absolute file path, asset file path or URI, you can only set one of them.", z);
            this.a = str;
            return this;
        }

        public a c(String str) {
            yab.q(str, "Manifest file path can not be empty");
            boolean z = false;
            if (this.b == null && this.c == null && (this.a == null || this.d)) {
                z = true;
            }
            yab.n("A local model source is from absolute file path, asset file path or URI, you can only set one of them.", z);
            this.a = str;
            this.d = true;
            return this;
        }

        public a d(String str) {
            yab.q(str, "Model Source file path can not be empty");
            boolean z = false;
            if (this.a == null && this.c == null && !this.d) {
                z = true;
            }
            yab.n("A local model source is from absolute file path, asset file path or URI, you can only set one of them.", z);
            this.b = str;
            return this;
        }

        public a e(String str) {
            yab.q(str, "Manifest file path can not be empty");
            boolean z = false;
            if (this.a == null && this.c == null && (this.b == null || this.d)) {
                z = true;
            }
            yab.n("A local model source is from absolute file path, asset file path or URI, you can only set one of them.", z);
            this.b = str;
            this.d = true;
            return this;
        }

        public a f(Uri uri) {
            boolean z = false;
            if (this.a == null && this.b == null) {
                z = true;
            }
            yab.n("A local model source is from absolute file path, asset file path or URI, you can only set one of them.", z);
            this.c = uri;
            return this;
        }
    }

    public /* synthetic */ vb9(String str, String str2, Uri uri, boolean z, stk stkVar) {
        this.a = str;
        this.b = str2;
        this.c = uri;
        this.d = z;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public Uri c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vb9)) {
            return false;
        }
        vb9 vb9Var = (vb9) obj;
        return f55.h(this.a, vb9Var.a) && f55.h(this.b, vb9Var.b) && f55.h(this.c, vb9Var.c) && this.d == vb9Var.d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.d)});
    }

    public String toString() {
        dc9 dc9Var = new dc9(getClass().getSimpleName(), 23);
        dc9Var.O(this.a, "absoluteFilePath");
        dc9Var.O(this.b, "assetFilePath");
        dc9Var.O(this.c, "uri");
        String strValueOf = String.valueOf(this.d);
        pul pulVar = new pul();
        ((kr6) dc9Var.d).c = pulVar;
        dc9Var.d = pulVar;
        pulVar.b = strValueOf;
        pulVar.a = "isManifestFile";
        return dc9Var.toString();
    }
}
