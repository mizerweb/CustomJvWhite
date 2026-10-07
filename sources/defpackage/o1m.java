package defpackage;

import android.content.Context;
import java.io.File;
import one.me.sdk.upload.messages.UploadConversionException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o1m {
    public static final boolean a(gka gkaVar) {
        fvi fviVar = gkaVar.e;
        return !(fviVar != null ? fviVar.e : false) && yab.A(fviVar != null ? fviVar.b : 0.0f, 0.0f) && yab.A(fviVar != null ? fviVar.c : 1.0f, 1.0f);
    }

    public static final qk0 b(Context context, Integer num) {
        return new qk0(context.getDrawable(R.drawable.icon_call_hold_fill).mutate(), awb.a, context, new x27(3), new x27(4), num);
    }

    public static final gka c(gka gkaVar, String str, mii miiVar, UploadConversionException uploadConversionException, xui xuiVar) {
        Object poeVar;
        miiVar.i(gkaVar.a.c, new ylc("fail_convert", 1));
        gm0.V(str, uploadConversionException.getMessage(), uploadConversionException);
        uj6 uj6VarA = gkaVar.a();
        String str2 = xuiVar.a;
        try {
            poeVar = Long.valueOf(new File(str2).lastModified());
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            poeVar = 0L;
        }
        uj6VarA.b = ((Number) poeVar).longValue();
        uj6VarA.a = str2;
        return new gka(uj6VarA);
    }
}
