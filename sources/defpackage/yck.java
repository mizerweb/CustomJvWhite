package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class yck extends ux8 implements qf7 {
    public final /* synthetic */ hdk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yck(hdk hdkVar) {
        super(2);
        this.a = hdkVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        ((Map) obj).put("master_package_name", this.a.e);
        return sbi.a;
    }
}
