package defpackage;

import com.vk.push.core.filedatastore.FileDataSource;
import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;
import com.vk.push.core.filedatastore.JsonSerializer;

/* JADX INFO: loaded from: classes4.dex */
public final class yu8 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public j9b f;
    public JsonSerializableFileDataStoreImpl g;
    public int h;
    public final /* synthetic */ JsonSerializableFileDataStoreImpl i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yu8(JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = jsonSerializableFileDataStoreImpl;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl = this.i;
        switch (i) {
            case 0:
                return new yu8(jsonSerializableFileDataStoreImpl, lq4Var, 0);
            default:
                return new yu8(jsonSerializableFileDataStoreImpl, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((yu8) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        j9b j9bVar;
        Throwable th;
        j9b j9bVar2;
        Object obj2;
        j9b j9bVar3;
        Throwable th2;
        j9b j9bVar4;
        Object obj3;
        int i = this.e;
        hu4 hu4Var = hu4.a;
        JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl = this.i;
        switch (i) {
            case 0:
                int i2 = this.h;
                try {
                    if (i2 == 0) {
                        ch3.d0(obj);
                        j9bVar = jsonSerializableFileDataStoreImpl.i;
                        this.f = j9bVar;
                        this.g = jsonSerializableFileDataStoreImpl;
                        this.h = 1;
                        if (j9bVar.b(this) == hu4Var) {
                            return hu4Var;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                ore.k("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j9bVar2 = this.f;
                            try {
                                ch3.d0(obj);
                                obj2 = ((roe) obj).a;
                                Boolean boolValueOf = Boolean.valueOf(!(obj2 instanceof poe));
                                j9bVar2.g(null);
                                return boolValueOf;
                            } catch (Throwable th3) {
                                th = th3;
                                j9bVar2.g(null);
                                throw th;
                            }
                        }
                        jsonSerializableFileDataStoreImpl = this.g;
                        j9b j9bVar5 = this.f;
                        ch3.d0(obj);
                        j9bVar = j9bVar5;
                    }
                    jsonSerializableFileDataStoreImpl.j = null;
                    FileDataSource fileDataSource = jsonSerializableFileDataStoreImpl.h;
                    String str = new String();
                    this.f = j9bVar;
                    this.g = null;
                    this.h = 2;
                    Object objM19setDatagIAlus = fileDataSource.m19setDatagIAlus(str, this);
                    if (objM19setDatagIAlus == hu4Var) {
                        return hu4Var;
                    }
                    j9b j9bVar6 = j9bVar;
                    obj2 = objM19setDatagIAlus;
                    j9bVar2 = j9bVar6;
                    Boolean boolValueOf2 = Boolean.valueOf(!(obj2 instanceof poe));
                    j9bVar2.g(null);
                    return boolValueOf2;
                } catch (Throwable th4) {
                    j9b j9bVar7 = j9bVar;
                    th = th4;
                    j9bVar2 = j9bVar7;
                    j9bVar2.g(null);
                    throw th;
                }
            default:
                int i3 = this.h;
                try {
                    if (i3 == 0) {
                        ch3.d0(obj);
                        j9bVar3 = jsonSerializableFileDataStoreImpl.i;
                        this.f = j9bVar3;
                        this.g = jsonSerializableFileDataStoreImpl;
                        this.h = 1;
                        if (j9bVar3.b(this) == hu4Var) {
                            return hu4Var;
                        }
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                ore.k("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j9bVar4 = this.f;
                            try {
                                ch3.d0(obj);
                                obj3 = ((roe) obj).a;
                                if (obj3 instanceof poe) {
                                    obj3 = null;
                                }
                                JsonSerializer jsonSerializer = (JsonSerializer) obj3;
                                j9bVar4.g(null);
                                return jsonSerializer;
                            } catch (Throwable th5) {
                                th2 = th5;
                                j9bVar4.g(null);
                                throw th2;
                            }
                        }
                        jsonSerializableFileDataStoreImpl = this.g;
                        j9b j9bVar8 = this.f;
                        ch3.d0(obj);
                        j9bVar3 = j9bVar8;
                    }
                    this.f = j9bVar3;
                    this.g = null;
                    this.h = 2;
                    Object objM20access$readUnsafeIoAF18A = JsonSerializableFileDataStoreImpl.m20access$readUnsafeIoAF18A(jsonSerializableFileDataStoreImpl, this);
                    if (objM20access$readUnsafeIoAF18A == hu4Var) {
                        return hu4Var;
                    }
                    j9b j9bVar9 = j9bVar3;
                    obj3 = objM20access$readUnsafeIoAF18A;
                    j9bVar4 = j9bVar9;
                    if (obj3 instanceof poe) {
                        obj3 = null;
                    }
                    JsonSerializer jsonSerializer2 = (JsonSerializer) obj3;
                    j9bVar4.g(null);
                    return jsonSerializer2;
                } catch (Throwable th6) {
                    j9b j9bVar10 = j9bVar3;
                    th2 = th6;
                    j9bVar4 = j9bVar10;
                    j9bVar4.g(null);
                    throw th2;
                }
        }
    }
}
