package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;

/* JADX INFO: loaded from: classes4.dex */
public final class uk extends f2 {
    public static final uk d;
    public static final uk e;
    public final /* synthetic */ int c;

    static {
        String str = "";
        d = new uk(rk.PROPERTY_X_NAME, str, 0);
        e = new uk(rk.PROPERTY_Y_NAME, str, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uk(rk rkVar, Object obj, int i) {
        super(rkVar, obj);
        this.c = i;
    }

    @Override // defpackage.f2
    public final Object d(Context context, XmlResourceParser xmlResourceParser, int i) {
        switch (this.c) {
            case 0:
                break;
        }
        return xmlResourceParser.getAttributeValue(i);
    }
}
