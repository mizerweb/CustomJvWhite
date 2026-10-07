package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import okhttp3.internal.connection.RouteException;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.protocol.HTTP;
import ru.ok.messages.http.UnknownOkhttpException;

/* JADX INFO: loaded from: classes.dex */
public final class q71 implements tj8 {
    public static final q71 b = new q71(1);
    public final /* synthetic */ int a;

    public /* synthetic */ q71(int i) {
        this.a = i;
    }

    @Override // defpackage.tj8
    public final pne a(f9e f9eVar) throws Throwable {
        hu7 hu7Var;
        Throwable th = null;
        switch (this.a) {
            case 0:
                System.currentTimeMillis();
                dle dleVar = f9eVar.e;
                v2a v2aVar = new v2a(dleVar, 12, (Object) null);
                h71 h71VarC = dleVar.f;
                if (h71VarC == null) {
                    h71VarC = cqk.C(dleVar.c);
                    dleVar.f = h71VarC;
                }
                if (h71VarC.j) {
                    v2aVar = new v2a((Object) null, 12, (Object) null);
                }
                dle dleVar2 = (dle) v2aVar.b;
                pne pneVar = (pne) v2aVar.c;
                if (dleVar2 == null && pneVar == null) {
                    return new pne(dleVar, twd.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", HttpStatus.SC_GATEWAY_TIMEOUT, null, new hu7((String[]) new ArrayList(20).toArray(new String[0])), uqi.c, null, null, null, -1L, System.currentTimeMillis(), null);
                }
                if (dleVar2 == null) {
                    one oneVarI = pneVar.I();
                    pne pneVarA = gp0.a(pneVar);
                    one.b(pneVarA, "cacheResponse");
                    oneVarI.i = pneVarA;
                    return oneVarI.a();
                }
                pne pneVarB = f9eVar.b(dleVar2);
                if (pneVar != null) {
                    if (pneVarB.d == 304) {
                        one oneVarI2 = pneVar.I();
                        hu7 hu7Var2 = pneVar.f;
                        hu7 hu7Var3 = pneVarB.f;
                        ArrayList arrayList = new ArrayList(20);
                        int size = hu7Var2.size();
                        int i = 0;
                        while (i < size) {
                            String strB = hu7Var2.b(i);
                            Throwable th2 = th;
                            String strF = hu7Var2.f(i);
                            if ("Warning".equalsIgnoreCase(strB)) {
                                hu7Var = hu7Var2;
                                if (z5h.K0(strF, "1", false)) {
                                }
                                i++;
                                th = th2;
                                hu7Var2 = hu7Var;
                            } else {
                                hu7Var = hu7Var2;
                            }
                            if (HTTP.CONTENT_LEN.equalsIgnoreCase(strB) || HTTP.CONTENT_ENCODING.equalsIgnoreCase(strB) || HTTP.CONTENT_TYPE.equalsIgnoreCase(strB) || !gp0.c(strB) || hu7Var3.a(strB) == null) {
                                arrayList.add(strB);
                                arrayList.add(r5h.y1(strF).toString());
                            }
                            i++;
                            th = th2;
                            hu7Var2 = hu7Var;
                        }
                        Throwable th3 = th;
                        int size2 = hu7Var3.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            String strB2 = hu7Var3.b(i2);
                            if (!HTTP.CONTENT_LEN.equalsIgnoreCase(strB2) && !HTTP.CONTENT_ENCODING.equalsIgnoreCase(strB2) && !HTTP.CONTENT_TYPE.equalsIgnoreCase(strB2) && gp0.c(strB2)) {
                                String strF2 = hu7Var3.f(i2);
                                arrayList.add(strB2);
                                arrayList.add(r5h.y1(strF2).toString());
                            }
                        }
                        String[] strArr = (String[]) arrayList.toArray(new String[0]);
                        p3c p3cVar = new p3c(10);
                        cx3.a1((ArrayList) p3cVar.b, strArr);
                        oneVarI2.f = p3cVar;
                        oneVarI2.k = pneVarB.k;
                        oneVarI2.l = pneVarB.l;
                        pne pneVarA2 = gp0.a(pneVar);
                        one.b(pneVarA2, "cacheResponse");
                        oneVarI2.i = pneVarA2;
                        pne pneVarA3 = gp0.a(pneVarB);
                        one.b(pneVarA3, "networkResponse");
                        oneVarI2.h = pneVarA3;
                        oneVarI2.a();
                        pneVarB.g.close();
                        throw th3;
                    }
                    rne rneVar = pneVar.g;
                    if (rneVar != null) {
                        uqi.d(rneVar);
                    }
                }
                one oneVarI3 = pneVarB.I();
                pne pneVarA4 = gp0.a(pneVar);
                one.b(pneVarA4, "cacheResponse");
                oneVarI3.i = pneVarA4;
                pne pneVarA5 = gp0.a(pneVarB);
                one.b(pneVarA5, "networkResponse");
                oneVarI3.h = pneVarA5;
                return oneVarI3.a();
            case 1:
                y8e y8eVar = f9eVar.a;
                synchronized (y8eVar) {
                    try {
                        if (!y8eVar.o) {
                            throw new IllegalStateException("released");
                        }
                        if (y8eVar.n) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (y8eVar.m) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                kd6 kd6Var = y8eVar.i;
                qsb qsbVar = y8eVar.a;
                kd6Var.getClass();
                try {
                    yf2 yf2Var = new yf2(y8eVar, y8eVar.e, kd6Var, kd6Var.a(f9eVar.f, f9eVar.g, f9eVar.h, qsbVar.f, !cqk.d(f9eVar.e.b, HttpGet.METHOD_NAME)).j(qsbVar, f9eVar));
                    y8eVar.l = yf2Var;
                    y8eVar.q = yf2Var;
                    synchronized (y8eVar) {
                        y8eVar.m = true;
                        y8eVar.n = true;
                    }
                    if (!y8eVar.p) {
                        return f9e.a(f9eVar, 0, yf2Var, null, 61).b(f9eVar.e);
                    }
                    qr7.k("Canceled");
                    return null;
                } catch (IOException e) {
                    kd6Var.b(e);
                    throw new RouteException(e);
                } catch (RouteException e2) {
                    kd6Var.b(e2.b);
                    throw e2;
                }
            default:
                dle dleVar3 = f9eVar.e;
                dleVar3.getClass();
                try {
                    return f9eVar.b(dleVar3);
                } catch (ClassCastException unused) {
                    qr7.k("ClassCastException");
                    return null;
                } catch (RuntimeException e3) {
                    throw new UnknownOkhttpException(e3, "Http redirect failed");
                }
        }
    }
}
