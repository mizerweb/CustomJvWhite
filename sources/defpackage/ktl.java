package defpackage;

import android.content.Context;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ktl implements jsl {
    public final oy8 a;
    public final esl b;

    public ktl(Context context, esl eslVar) {
        this.b = eslVar;
        g71 g71Var = g71.e;
        g4i.b(context);
        e4i e4iVarC = g4i.a().c(g71Var);
        if (g71.d.contains(new z86("json"))) {
            new oy8(new ftl(e4iVarC, 0));
        }
        this.a = new oy8(new ftl(e4iVarC, 1));
    }

    @Override // defpackage.jsl
    public final void a(phf phfVar) {
        esl eslVar = this.b;
        eslVar.getClass();
        f4i f4iVar = (f4i) this.a.get();
        eslVar.getClass();
        so2 so2Var = so2.n;
        xtj xtjVar = (xtj) phfVar.b;
        ((o73) phfVar.c).i = false;
        o73 o73Var = (o73) phfVar.c;
        o73Var.g = Boolean.FALSE;
        xtjVar.b = new fpl(o73Var);
        try {
            dul.A();
            fil filVar = new fil(xtjVar);
            euc eucVar = new euc(22);
            so2Var.e(eucVar);
            HashMap map = new HashMap((HashMap) eucVar.b);
            HashMap map2 = new HashMap((HashMap) eucVar.c);
            fok fokVar = (fok) eucVar.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                iok iokVar = new iok(byteArrayOutputStream, map, map2, fokVar);
                zpb zpbVar = (zpb) map.get(fil.class);
                if (zpbVar == null) {
                    throw new EncodingException("No encoder for ".concat(String.valueOf(fil.class)));
                }
                zpbVar.a(filVar, iokVar);
                f4iVar.a(new jh0(byteArrayOutputStream.toByteArray(), vhd.b, null));
            } catch (IOException unused) {
            }
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
