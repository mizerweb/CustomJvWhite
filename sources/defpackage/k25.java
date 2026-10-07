package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class k25 extends ya9 {
    public final /* synthetic */ int c = 1;

    public k25(qg7 qg7Var) {
        super(x72.a, qg7Var);
    }

    @Override // defpackage.ya9
    public final p76 d(v78 v78Var) {
        boolean zEquals;
        byte[] bytes;
        switch (this.c) {
            case 0:
                String string = v78Var.b.toString();
                oc9.i(Boolean.valueOf(string.substring(0, 5).equals("data:")));
                int iIndexOf = string.indexOf(44);
                String strSubstring = string.substring(iIndexOf + 1, string.length());
                String strSubstring2 = string.substring(0, iIndexOf);
                if (strSubstring2.contains(";")) {
                    String[] strArrSplit = strSubstring2.split(";");
                    zEquals = strArrSplit[strArrSplit.length - 1].equals("base64");
                } else {
                    zEquals = false;
                }
                if (zEquals) {
                    bytes = Base64.decode(strSubstring, 0);
                } else {
                    String strDecode = Uri.decode(strSubstring);
                    strDecode.getClass();
                    bytes = strDecode.getBytes();
                }
                return c(new ByteArrayInputStream(bytes), bytes.length);
            default:
                return c(new FileInputStream(v78Var.d().toString()), (int) v78Var.d().length());
        }
    }

    @Override // defpackage.ya9
    public final String e() {
        switch (this.c) {
            case 0:
                return "DataFetchProducer";
            default:
                return "LocalFileFetchProducer";
        }
    }

    public k25(Executor executor, qg7 qg7Var) {
        super(executor, qg7Var);
    }
}
