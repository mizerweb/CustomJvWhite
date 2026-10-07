package defpackage;

import android.net.Uri;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class w78 {
    public static final HashSet n = new HashSet();
    public Uri a;
    public u78 b;
    public int c;
    public bne d;
    public iue e;
    public d68 f;
    public t78 g;
    public boolean h;
    public boolean i;
    public whd j;
    public qcd k;
    public ls0 l;
    public at5 m;

    public static w78 b(v78 v78Var) {
        w78 w78VarD = d(v78Var.b);
        w78VarD.f = v78Var.g;
        w78VarD.g = v78Var.a;
        w78VarD.h = v78Var.e;
        w78VarD.i = v78Var.c();
        w78VarD.b = v78Var.k;
        w78VarD.c = v78Var.l;
        w78VarD.k = v78Var.o;
        w78VarD.j = v78Var.j;
        w78VarD.d = v78Var.h;
        w78VarD.l = v78Var.p;
        w78VarD.e = v78Var.i;
        w78VarD.m = v78Var.q;
        return w78VarD;
    }

    public static boolean c(Uri uri) {
        HashSet hashSet = n;
        if (hashSet == null || uri == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(uri.getScheme())) {
                return true;
            }
        }
        return false;
    }

    public static w78 d(Uri uri) {
        w78 w78Var = new w78();
        w78Var.a = null;
        w78Var.b = u78.FULL_FETCH;
        w78Var.c = 0;
        w78Var.d = null;
        w78Var.e = null;
        w78Var.f = d68.c;
        w78Var.g = t78.b;
        w78Var.h = false;
        w78Var.i = false;
        w78Var.j = whd.c;
        w78Var.k = null;
        w78Var.m = null;
        uri.getClass();
        w78Var.a = uri;
        return w78Var;
    }

    public final v78 a() {
        Uri uri = this.a;
        if (uri == null) {
            final String str = "Source must be set!";
            throw new RuntimeException(str) { // from class: com.facebook.imagepipeline.request.ImageRequestBuilder$BuilderException
                {
                    super("Invalid request builder: ".concat(str));
                }
            };
        }
        if ("res".equals(rki.b(uri))) {
            if (!this.a.isAbsolute()) {
                final String str2 = "Resource URI path must be absolute.";
                throw new RuntimeException(str2) { // from class: com.facebook.imagepipeline.request.ImageRequestBuilder$BuilderException
                    {
                        super("Invalid request builder: ".concat(str2));
                    }
                };
            }
            if (this.a.getPath().isEmpty()) {
                final String str3 = "Resource URI must not be empty";
                throw new RuntimeException(str3) { // from class: com.facebook.imagepipeline.request.ImageRequestBuilder$BuilderException
                    {
                        super("Invalid request builder: ".concat(str3));
                    }
                };
            }
            try {
                Integer.parseInt(this.a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                final String str4 = "Resource URI path must be a resource id.";
                throw new RuntimeException(str4) { // from class: com.facebook.imagepipeline.request.ImageRequestBuilder$BuilderException
                    {
                        super("Invalid request builder: ".concat(str4));
                    }
                };
            }
        }
        if (!"asset".equals(rki.b(this.a)) || this.a.isAbsolute()) {
            return new v78(this);
        }
        final String str5 = "Asset URI path must be absolute.";
        throw new RuntimeException(str5) { // from class: com.facebook.imagepipeline.request.ImageRequestBuilder$BuilderException
            {
                super("Invalid request builder: ".concat(str5));
            }
        };
    }
}
