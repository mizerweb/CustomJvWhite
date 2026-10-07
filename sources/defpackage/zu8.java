package defpackage;

import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class zu8 extends nq4 {
    public JsonSerializableFileDataStoreImpl d;
    public JsonSerializableFileDataStoreImpl e;
    public /* synthetic */ Object f;
    public final /* synthetic */ JsonSerializableFileDataStoreImpl g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu8(JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl, lq4 lq4Var) {
        super(lq4Var);
        this.g = jsonSerializableFileDataStoreImpl;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        Object objM20access$readUnsafeIoAF18A = JsonSerializableFileDataStoreImpl.m20access$readUnsafeIoAF18A(this.g, this);
        return objM20access$readUnsafeIoAF18A == hu4.a ? objM20access$readUnsafeIoAF18A : new roe(objM20access$readUnsafeIoAF18A);
    }
}
