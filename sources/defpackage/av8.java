package defpackage;

import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;
import com.vk.push.core.filedatastore.JsonSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class av8 extends nq4 {
    public JsonSerializableFileDataStoreImpl d;
    public JsonSerializer e;
    public JsonSerializableFileDataStoreImpl f;
    public /* synthetic */ Object g;
    public final /* synthetic */ JsonSerializableFileDataStoreImpl h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av8(JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl, lq4 lq4Var) {
        super(lq4Var);
        this.h = jsonSerializableFileDataStoreImpl;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        Object objM21access$writeUnsafegIAlus = JsonSerializableFileDataStoreImpl.m21access$writeUnsafegIAlus(this.h, null, this);
        return objM21access$writeUnsafegIAlus == hu4.a ? objM21access$writeUnsafegIAlus : new roe(objM21access$writeUnsafegIAlus);
    }
}
