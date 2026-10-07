package defpackage;

import android.net.Uri;
import java.io.OutputStream;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.api.core.ApiRequestException;
import ru.ok.android.api.core.ApiScopeException;
import ru.ok.android.api.json.JsonSerializeException;

/* JADX INFO: loaded from: classes.dex */
public final class mp4 {
    public static k5h c;
    public static k5h d;
    public volatile Object a;
    public final AbstractCollection b;

    public mp4(int i) {
        switch (i) {
            case 1:
                this.a = j18.r0;
                this.b = new ArrayList();
                break;
            default:
                this.b = new CopyOnWriteArraySet();
                break;
        }
    }

    public Uri a(zo zoVar) {
        Uri uri = zoVar.getUri();
        if (!cqk.d(uri.getScheme(), "ok")) {
            return uri;
        }
        Uri uriO = ((j18) this.a).o(uri.getAuthority());
        Uri.Builder builderEncodedAuthority = uri.buildUpon().scheme(uriO.getScheme()).encodedAuthority(uriO.getEncodedAuthority());
        String encodedPath = uriO.getEncodedPath();
        String encodedPath2 = uri.getEncodedPath();
        if (encodedPath == null || encodedPath.length() == 0 || encodedPath.equals("/")) {
            encodedPath = encodedPath2;
        } else if (encodedPath2 != null && encodedPath2.length() != 0 && !encodedPath2.equals("/")) {
            if (encodedPath.charAt(encodedPath.length() - 1) == '/') {
                encodedPath = encodedPath.substring(0, encodedPath.length() - 1);
            }
            encodedPath = encodedPath.concat(encodedPath2);
        }
        Uri.Builder builderEncodedPath = builderEncodedAuthority.encodedPath(encodedPath);
        String encodedQuery = uriO.getEncodedQuery();
        String encodedQuery2 = uri.getEncodedQuery();
        if (encodedQuery == null || encodedQuery.length() == 0) {
            encodedQuery = encodedQuery2;
        } else if (encodedQuery2 != null && encodedQuery.length() != 0) {
            encodedQuery = zo5.p(encodedQuery, "&", encodedQuery2);
        }
        return builderEncodedPath.encodedQuery(encodedQuery).build();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d0  */
    public void b(OutputStream outputStream, op opVar, uo uoVar, int i) {
        String strA;
        String strB;
        up scope = opVar.getScope();
        String authority = opVar.getUri().getAuthority();
        ArrayList arrayList = new ArrayList(((ArrayList) this.b).size() + 2);
        for (k5h k5hVar : (ArrayList) this.b) {
            k5hVar.getClass();
            arrayList.add(k5hVar);
        }
        int iOrdinal = scope.ordinal();
        String str = null;
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            strA = uoVar.a();
            if (strA == null) {
                throw new ApiScopeException("No app key");
            }
        } else {
            strA = null;
        }
        if (strA != null) {
            k5h k5hVar2 = c;
            if (k5hVar2 == null || !k5hVar2.a().equals(strA)) {
                k5hVar2 = new k5h("application_key", strA);
                c = k5hVar2;
            }
            arrayList.add(k5hVar2);
        }
        int iOrdinal2 = scope.ordinal();
        if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            strB = uoVar.b();
            if (strB == null) {
                throw new ApiScopeException("No session key");
            }
        } else {
            strB = null;
        }
        int iOrdinal3 = scope.ordinal();
        String strC = (iOrdinal3 == 2 || iOrdinal3 == 3) ? uoVar.c() : null;
        if (k18.$EnumSwitchMapping$1[scope.ordinal()] == 1) {
            throw new ApiScopeException("No user");
        }
        if (strB != null) {
            k5h k5hVar3 = d;
            if (k5hVar3 == null || !k5hVar3.a().equals(strB)) {
                k5hVar3 = new k5h("session_key", strB);
                d = k5hVar3;
            }
            arrayList.add(k5hVar3);
        }
        int iD = qt4.D(i);
        if (iD == 0) {
            str = strC;
        } else if (iD != 1) {
            if (iD != 2) {
                ore.o();
                return;
            } else if (!cqk.d(((j18) this.a).o(authority).getScheme(), "https")) {
                str = strC;
            }
        }
        if (str != null && arrayList.size() > 1) {
            bx3.Y0(arrayList, new lv5(29));
        }
        v18 v18Var = new v18(outputStream, arrayList, str);
        v18Var.E();
        try {
            opVar.writeParams(v18Var);
            v18Var.I();
        } catch (JsonSerializeException e) {
            throw new ApiRequestException(e);
        }
    }
}
