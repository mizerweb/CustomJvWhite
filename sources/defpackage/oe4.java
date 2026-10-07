package defpackage;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class oe4 {
    public final List a;
    public int b;
    public boolean c;
    public boolean d;

    public oe4(List list) {
        this.a = list;
    }

    public final ne4 a(SSLSocket sSLSocket) throws UnknownServiceException {
        ne4 ne4Var;
        int i;
        boolean z;
        int i2 = this.b;
        List list = this.a;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                ne4Var = null;
                break;
            }
            ne4Var = (ne4) list.get(i2);
            if (ne4Var.b(sSLSocket)) {
                this.b = i2 + 1;
                break;
            }
            i2++;
        }
        if (ne4Var == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.d);
            sb.append(", modes=");
            sb.append(list);
            String string = Arrays.toString(sSLSocket.getEnabledProtocols());
            sb.append(", supported protocols=");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        String[] strArr = ne4Var.c;
        String[] strArr2 = ne4Var.d;
        int i3 = this.b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z = false;
                break;
            }
            if (((ne4) list.get(i3)).b(sSLSocket)) {
                z = true;
                break;
            }
            i3++;
        }
        this.c = z;
        boolean z2 = this.d;
        String[] strArrP = strArr != null ? uqi.p(sSLSocket.getEnabledCipherSuites(), strArr, ar3.c) : sSLSocket.getEnabledCipherSuites();
        String[] strArrP2 = strArr2 != null ? uqi.p(sSLSocket.getEnabledProtocols(), strArr2, kbb.a) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        o6 o6Var = ar3.c;
        byte[] bArr = uqi.a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (o6Var.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z2 && i != -1) {
            String str = supportedCipherSuites[i];
            strArrP = (String[]) Arrays.copyOf(strArrP, strArrP.length + 1);
            strArrP[strArrP.length - 1] = str;
        }
        me4 me4Var = new me4();
        me4Var.a = ne4Var.a;
        me4Var.b = strArr;
        me4Var.c = strArr2;
        me4Var.d = ne4Var.b;
        me4Var.c((String[]) Arrays.copyOf(strArrP, strArrP.length));
        me4Var.e((String[]) Arrays.copyOf(strArrP2, strArrP2.length));
        ne4 ne4VarA = me4Var.a();
        if (ne4VarA.c() != null) {
            sSLSocket.setEnabledProtocols(ne4VarA.d);
        }
        if (ne4VarA.a() != null) {
            sSLSocket.setEnabledCipherSuites(ne4VarA.c);
        }
        return ne4Var;
    }
}
