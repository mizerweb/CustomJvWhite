package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class tek extends ux8 implements cf7 {
    public static final tek b;
    public static final tek c;
    public static final tek d;
    public static final tek e;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new tek(i, 0);
        c = new tek(i, 1);
        d = new tek(i, 2);
        e = new tek(i, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tek(ri riVar, int i) {
        super(1);
        this.a = i;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                String str = (String) ((x8b) obj).a.get(new vdd("push_token"));
                if (str != null) {
                    return new i6k(str);
                }
                return null;
            case 1:
                xek.a.getClass();
                return (b35) xek.e.m((Context) obj, xek.b[2]);
            case 2:
                vdd vddVar = new vdd("last_delivered_push_token");
                LinkedHashMap linkedHashMap = ((x8b) obj).a;
                String str2 = (String) linkedHashMap.get(vddVar);
                if (str2 == null) {
                    return null;
                }
                Boolean bool = (Boolean) linkedHashMap.get(new vdd("push_token_delivered_to_client_app"));
                return new q6k(str2, bool != null ? bool.booleanValue() : false);
            case 3:
                return lkl.c(new wdd[0]);
            case 4:
                return sbiVar;
            default:
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tek(int i, int i2) {
        super(i);
        this.a = i2;
    }
}
