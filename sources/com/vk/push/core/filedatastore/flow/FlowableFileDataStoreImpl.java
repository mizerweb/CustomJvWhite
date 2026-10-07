package com.vk.push.core.filedatastore.flow;

import com.vk.push.core.filedatastore.FileDataStore;
import defpackage.cf7;
import defpackage.ch3;
import defpackage.d9b;
import defpackage.e9i;
import defpackage.gu4;
import defpackage.hu4;
import defpackage.ifh;
import defpackage.kr0;
import defpackage.lq4;
import defpackage.ore;
import defpackage.x07;
import defpackage.xx6;
import defpackage.y07;
import defpackage.z07;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000e\u001a\u00020\r2\u0016\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\nJ\u001b\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/vk/push/core/filedatastore/flow/FlowableFileDataStoreImpl;", "T", "Lcom/vk/push/core/filedatastore/flow/FlowableFileDataStore;", "Lcom/vk/push/core/filedatastore/FileDataStore;", "original", "Lgu4;", "scope", "<init>", "(Lcom/vk/push/core/filedatastore/FileDataStore;Lgu4;)V", "read", "(Llq4;)Ljava/lang/Object;", "Lkotlin/Function1;", "transform", "", "edit", "(Lcf7;Llq4;)Ljava/lang/Object;", "clear", "data", "write", "(Ljava/lang/Object;Llq4;)Ljava/lang/Object;", "Lxx6;", "flow", "()Lxx6;", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FlowableFileDataStoreImpl<T> implements FlowableFileDataStore<T>, FileDataStore<T> {
    public final FileDataStore a;
    public final ifh b;

    public FlowableFileDataStoreImpl(FileDataStore<T> fileDataStore, gu4 gu4Var) {
        this.a = fileDataStore;
        this.b = new ifh(new kr0(gu4Var, 2, this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.vk.push.core.filedatastore.FileDataStore
    public Object clear(lq4 lq4Var) {
        x07 x07Var;
        if (lq4Var instanceof x07) {
            x07Var = (x07) lq4Var;
            int i = x07Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                x07Var.g = i - Integer.MIN_VALUE;
            } else {
                x07Var = new x07(this, lq4Var);
            }
        } else {
            x07Var = new x07(this, lq4Var);
        }
        Object objClear = x07Var.e;
        int i2 = x07Var.g;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objClear);
            x07Var.d = this;
            x07Var.g = 1;
            objClear = this.a.clear(x07Var);
            if (objClear != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj = x07Var.d;
            ch3.d0(objClear);
            return obj;
        }
        this = (FlowableFileDataStoreImpl) x07Var.d;
        ch3.d0(objClear);
        ((Boolean) objClear).getClass();
        d9b d9bVar = (d9b) this.b.getValue();
        x07Var.d = objClear;
        x07Var.g = 2;
        return d9bVar.emit(null, x07Var) == hu4Var ? hu4Var : objClear;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.vk.push.core.filedatastore.FileDataStore
    public Object edit(cf7 cf7Var, lq4 lq4Var) {
        y07 y07Var;
        d9b d9bVar;
        Object obj;
        if (lq4Var instanceof y07) {
            y07Var = (y07) lq4Var;
            int i = y07Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                y07Var.h = i - Integer.MIN_VALUE;
            } else {
                y07Var = new y07(this, lq4Var);
            }
        } else {
            y07Var = new y07(this, lq4Var);
        }
        Object objEdit = y07Var.f;
        int i2 = y07Var.h;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objEdit);
            y07Var.d = this;
            y07Var.h = 1;
            objEdit = this.a.edit(cf7Var, y07Var);
            if (objEdit != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            this = (FlowableFileDataStoreImpl) y07Var.d;
            ch3.d0(objEdit);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj2 = y07Var.d;
                ch3.d0(objEdit);
                return obj2;
            }
            d9bVar = y07Var.e;
            obj = y07Var.d;
            ch3.d0(objEdit);
        }
        y07Var.d = obj;
        y07Var.e = null;
        y07Var.h = 3;
        if (d9bVar.emit(objEdit, y07Var) != hu4Var) {
            return hu4Var;
        }
        return obj;
        ((Boolean) objEdit).getClass();
        d9b d9bVar2 = (d9b) this.b.getValue();
        y07Var.d = objEdit;
        y07Var.e = d9bVar2;
        y07Var.h = 2;
        Object obj3 = this.read(y07Var);
        if (obj3 != hu4Var) {
            Object obj4 = objEdit;
            objEdit = obj3;
            d9bVar = d9bVar2;
            obj = obj4;
            y07Var.d = obj;
            y07Var.e = null;
            y07Var.h = 3;
            if (d9bVar.emit(objEdit, y07Var) != hu4Var) {
                return obj;
            }
        }
        return hu4Var;
    }

    @Override // com.vk.push.core.filedatastore.flow.FlowableFileDataStore
    public xx6 flow() {
        return e9i.I((d9b) this.b.getValue());
    }

    @Override // com.vk.push.core.filedatastore.FileDataStore
    public Object read(lq4 lq4Var) {
        return this.a.read(lq4Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.vk.push.core.filedatastore.FileDataStore
    public Object write(T t, lq4 lq4Var) {
        z07 z07Var;
        if (lq4Var instanceof z07) {
            z07Var = (z07) lq4Var;
            int i = z07Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                z07Var.h = i - Integer.MIN_VALUE;
            } else {
                z07Var = new z07(this, lq4Var);
            }
        } else {
            z07Var = new z07(this, lq4Var);
        }
        Object objWrite = z07Var.f;
        int i2 = z07Var.h;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objWrite);
            z07Var.d = this;
            z07Var.e = t;
            z07Var.h = 1;
            objWrite = this.a.write(t, z07Var);
            if (objWrite != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj = z07Var.d;
            ch3.d0(objWrite);
            return obj;
        }
        t = (T) z07Var.e;
        this = (FlowableFileDataStoreImpl) z07Var.d;
        ch3.d0(objWrite);
        ((Boolean) objWrite).getClass();
        d9b d9bVar = (d9b) this.b.getValue();
        z07Var.d = objWrite;
        z07Var.e = null;
        z07Var.h = 2;
        return d9bVar.emit(t, z07Var) == hu4Var ? hu4Var : objWrite;
    }
}
