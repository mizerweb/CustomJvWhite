package defpackage;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Stream;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.onelog.OneLogImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f05 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ f05(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((ov8) ((gab) obj)).a;
            case 1:
                return Short.valueOf(((pbj) ((gab) obj)).b);
            case 2:
                return (skc) ((zkc) ((gab) obj)).b.get(0);
            case 3:
                List list = i05.A;
                return null;
            case 4:
                return ((gab) obj).getClass();
            case 5:
                return ((gab) obj).getClass();
            case 6:
                return ((r9i) ((gab) obj)).a;
            case 7:
                return OneLogImpl.lambda$upload$0((String) obj);
            case 8:
                return ((skc) obj).a;
            case 9:
                return Long.valueOf(((pj4) obj).a);
            case 10:
                return jj8.a;
            case 11:
                return ConcurrentHashMap.newKeySet(1);
            case 12:
                return ((fi4) obj).a();
            case 13:
                try {
                    return ((X509Certificate) obj).getEncoded();
                } catch (CertificateEncodingException e) {
                    qr7.o(e);
                    return null;
                }
            case 14:
                return ((z5k) obj).b;
            case 15:
                return ((z5k) ((Map.Entry) obj).getValue()).b;
            case 16:
                return (Integer) ((Map.Entry) obj).getKey();
            case 17:
                return ((p5k) obj).getClass().getSimpleName();
            case 18:
                String str = (String) obj;
                return str.endsWith("Message") ? str.substring(0, str.length() - 7) : str;
            case 19:
                q8k q8kVar = (q8k) obj;
                long j = q8kVar.b;
                long j2 = q8kVar.a;
                if (((int) ((j - j2) + 1)) == 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(j);
                    return sb.toString();
                }
                return j + "-" + j2;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                q8k q8kVar2 = (q8k) obj;
                p8k p8kVar = new p8k();
                p8kVar.a = q8kVar2.b;
                return Stream.generate(p8kVar).limit((int) ((q8kVar2.b - q8kVar2.a) + 1));
            case 21:
                return ((hfk) obj).toString();
            case 22:
                return ((gab) obj).toString();
            case 23:
                return ((gab) obj).b();
            case 24:
                return ((zbk) obj).b;
            case 25:
                return ((zbk) obj).b;
            case 26:
                return ((zbk) obj).b;
            case 27:
                return ((zbk) obj).b;
            case 28:
                return ((e8k) obj).toString();
            default:
                return ((rck) obj).a;
        }
    }

    public /* synthetic */ f05(int i, Object obj) {
        this.a = i;
    }
}
