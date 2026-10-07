package ru.ok.tamtam.nano;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.vk.push.core.base.AidlException;
import defpackage.ck8;
import defpackage.cqk;
import defpackage.em9;
import defpackage.sb8;
import defpackage.sia;
import defpackage.su3;
import defpackage.uu3;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface Tasks {
    public static final int FAVORITE_STICKER = 3;
    public static final int FAVORITE_STICKER_SET = 4;
    public static final int RECENT = 5;
    public static final int STICKER = 1;
    public static final int STICKER_SET = 2;
    public static final int UNKNOWN = 0;

    public static final class MsgSendCallback extends sia {
        private static volatile MsgSendCallback[] _emptyArray;
        public ButtonPosition buttonPosition;
        public String buttonType;
        public String callbackId;
        public long messageId;
        public String payload;
        public long requestId;
        public long timestamp;

        public MsgSendCallback() {
            clear();
        }

        public static MsgSendCallback[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgSendCallback[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgSendCallback parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgSendCallback) sia.mergeFrom(new MsgSendCallback(), bArr);
        }

        public MsgSendCallback clear() {
            this.requestId = 0L;
            this.callbackId = "";
            this.payload = "";
            this.timestamp = 0L;
            this.messageId = 0L;
            this.buttonPosition = null;
            this.buttonType = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            if (!this.callbackId.equals("")) {
                iH += uu3.l(2, this.callbackId);
            }
            if (!this.payload.equals("")) {
                iH += uu3.l(3, this.payload);
            }
            long j2 = this.timestamp;
            if (j2 != 0) {
                iH += uu3.h(4, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                iH += uu3.h(5, j3);
            }
            ButtonPosition buttonPosition = this.buttonPosition;
            if (buttonPosition != null) {
                iH += uu3.i(6, buttonPosition);
            }
            return !this.buttonType.equals("") ? uu3.l(7, this.buttonType) + iH : iH;
        }

        @Override // defpackage.sia
        public MsgSendCallback mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 18) {
                    this.callbackId = su3Var.r();
                } else if (iS == 26) {
                    this.payload = su3Var.r();
                } else if (iS == 32) {
                    this.timestamp = su3Var.q();
                } else if (iS == 40) {
                    this.messageId = su3Var.q();
                } else if (iS == 50) {
                    if (this.buttonPosition == null) {
                        this.buttonPosition = new ButtonPosition();
                    }
                    su3Var.j(this.buttonPosition);
                } else if (iS == 58) {
                    this.buttonType = su3Var.r();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            if (!this.callbackId.equals("")) {
                uu3Var.E(2, this.callbackId);
            }
            if (!this.payload.equals("")) {
                uu3Var.E(3, this.payload);
            }
            long j2 = this.timestamp;
            if (j2 != 0) {
                uu3Var.x(4, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                uu3Var.x(5, j3);
            }
            ButtonPosition buttonPosition = this.buttonPosition;
            if (buttonPosition != null) {
                uu3Var.y(6, buttonPosition);
            }
            if (this.buttonType.equals("")) {
                return;
            }
            uu3Var.E(7, this.buttonType);
        }

        public static final class ButtonPosition extends sia {
            private static volatile ButtonPosition[] _emptyArray;
            public int column;
            public int row;

            public ButtonPosition() {
                clear();
            }

            public static ButtonPosition[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (ck8.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ButtonPosition[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static ButtonPosition parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ButtonPosition) sia.mergeFrom(new ButtonPosition(), bArr);
            }

            public ButtonPosition clear() {
                this.row = 0;
                this.column = 0;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.sia
            public int computeSerializedSize() {
                int i = this.row;
                int iF = i != 0 ? uu3.f(1, i) : 0;
                int i2 = this.column;
                return i2 != 0 ? uu3.f(2, i2) + iF : iF;
            }

            @Override // defpackage.sia
            public ButtonPosition mergeFrom(su3 su3Var) throws IOException {
                while (true) {
                    int iS = su3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 8) {
                        this.row = su3Var.p();
                    } else if (iS == 16) {
                        this.column = su3Var.p();
                    } else if (!su3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }

            @Override // defpackage.sia
            public void writeTo(uu3 uu3Var) throws IOException {
                int i = this.row;
                if (i != 0) {
                    uu3Var.w(1, i);
                }
                int i2 = this.column;
                if (i2 != 0) {
                    uu3Var.w(2, i2);
                }
            }

            public static ButtonPosition parseFrom(su3 su3Var) throws IOException {
                return new ButtonPosition().mergeFrom(su3Var);
            }
        }

        public static MsgSendCallback parseFrom(su3 su3Var) throws IOException {
            return new MsgSendCallback().mergeFrom(su3Var);
        }
    }

    public static final class AssetsAdd extends sia {
        private static volatile AssetsAdd[] _emptyArray;
        public int assetType;
        public long id;
        public long requestId;

        public AssetsAdd() {
            clear();
        }

        public static AssetsAdd[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new AssetsAdd[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static AssetsAdd parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (AssetsAdd) sia.mergeFrom(new AssetsAdd(), bArr);
        }

        public AssetsAdd clear() {
            this.requestId = 0L;
            this.assetType = 0;
            this.id = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            int i = this.assetType;
            if (i != 0) {
                iH += uu3.f(2, i);
            }
            long j2 = this.id;
            return j2 != 0 ? uu3.h(3, j2) + iH : iH;
        }

        @Override // defpackage.sia
        public AssetsAdd mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    int iP = su3Var.p();
                    if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4 || iP == 5) {
                        this.assetType = iP;
                    }
                } else if (iS == 24) {
                    this.id = su3Var.q();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            int i = this.assetType;
            if (i != 0) {
                uu3Var.w(2, i);
            }
            long j2 = this.id;
            if (j2 != 0) {
                uu3Var.x(3, j2);
            }
        }

        public static AssetsAdd parseFrom(su3 su3Var) throws IOException {
            return new AssetsAdd().mergeFrom(su3Var);
        }
    }

    public static final class AssetsListModify extends sia {
        private static volatile AssetsListModify[] _emptyArray;
        public int assetType;
        public long[] ids;
        public long modifyTime;
        public long requestId;

        public AssetsListModify() {
            clear();
        }

        public static AssetsListModify[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new AssetsListModify[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static AssetsListModify parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (AssetsListModify) sia.mergeFrom(new AssetsListModify(), bArr);
        }

        public AssetsListModify clear() {
            this.requestId = 0L;
            this.assetType = 0;
            this.ids = sb8.f;
            this.modifyTime = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long[] jArr;
            long j = this.requestId;
            int i = 0;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            int i2 = this.assetType;
            if (i2 != 0) {
                iH += uu3.f(2, i2);
            }
            long[] jArr2 = this.ids;
            if (jArr2 != null && jArr2.length > 0) {
                int iK = 0;
                while (true) {
                    jArr = this.ids;
                    if (i >= jArr.length) {
                        break;
                    }
                    iK += uu3.k(jArr[i]);
                    i++;
                }
                iH = iH + iK + jArr.length;
            }
            long j2 = this.modifyTime;
            return j2 != 0 ? uu3.h(4, j2) + iH : iH;
        }

        @Override // defpackage.sia
        public AssetsListModify mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    int iP = su3Var.p();
                    if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4 || iP == 5) {
                        this.assetType = iP;
                    }
                } else if (iS == 24) {
                    int I = sb8.I(su3Var, 24);
                    long[] jArr = this.ids;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = I + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = su3Var.q();
                        su3Var.s();
                        length++;
                    }
                    jArr2[length] = su3Var.q();
                    this.ids = jArr2;
                } else if (iS == 26) {
                    int iE = su3Var.e(su3Var.p());
                    int iC = su3Var.c();
                    int i2 = 0;
                    while (su3Var.b() > 0) {
                        su3Var.q();
                        i2++;
                    }
                    su3Var.t(iC);
                    long[] jArr3 = this.ids;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = su3Var.q();
                        length2++;
                    }
                    this.ids = jArr4;
                    su3Var.d(iE);
                } else if (iS == 32) {
                    this.modifyTime = su3Var.q();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            int i = this.assetType;
            if (i != 0) {
                uu3Var.w(2, i);
            }
            long[] jArr = this.ids;
            if (jArr != null && jArr.length > 0) {
                int i2 = 0;
                while (true) {
                    long[] jArr2 = this.ids;
                    if (i2 >= jArr2.length) {
                        break;
                    }
                    uu3Var.x(3, jArr2[i2]);
                    i2++;
                }
            }
            long j2 = this.modifyTime;
            if (j2 != 0) {
                uu3Var.x(4, j2);
            }
        }

        public static AssetsListModify parseFrom(su3 su3Var) throws IOException {
            return new AssetsListModify().mergeFrom(su3Var);
        }
    }

    public static final class AssetsMove extends sia {
        private static volatile AssetsMove[] _emptyArray;
        public int assetType;
        public long id;
        public int position;
        public long prevId;
        public long requestId;

        public AssetsMove() {
            clear();
        }

        public static AssetsMove[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new AssetsMove[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static AssetsMove parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (AssetsMove) sia.mergeFrom(new AssetsMove(), bArr);
        }

        public AssetsMove clear() {
            this.requestId = 0L;
            this.assetType = 0;
            this.id = 0L;
            this.prevId = 0L;
            this.position = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            int i = this.assetType;
            if (i != 0) {
                iH += uu3.f(2, i);
            }
            long j2 = this.id;
            if (j2 != 0) {
                iH += uu3.h(3, j2);
            }
            long j3 = this.prevId;
            if (j3 != 0) {
                iH += uu3.h(4, j3);
            }
            int i2 = this.position;
            return i2 != 0 ? uu3.f(5, i2) + iH : iH;
        }

        @Override // defpackage.sia
        public AssetsMove mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    int iP = su3Var.p();
                    if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4 || iP == 5) {
                        this.assetType = iP;
                    }
                } else if (iS == 24) {
                    this.id = su3Var.q();
                } else if (iS == 32) {
                    this.prevId = su3Var.q();
                } else if (iS == 40) {
                    this.position = su3Var.p();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            int i = this.assetType;
            if (i != 0) {
                uu3Var.w(2, i);
            }
            long j2 = this.id;
            if (j2 != 0) {
                uu3Var.x(3, j2);
            }
            long j3 = this.prevId;
            if (j3 != 0) {
                uu3Var.x(4, j3);
            }
            int i2 = this.position;
            if (i2 != 0) {
                uu3Var.w(5, i2);
            }
        }

        public static AssetsMove parseFrom(su3 su3Var) throws IOException {
            return new AssetsMove().mergeFrom(su3Var);
        }
    }

    public static final class AssetsRemove extends sia {
        private static volatile AssetsRemove[] _emptyArray;
        public int assetType;
        public long id;
        public long[] ids;
        public long requestId;

        public AssetsRemove() {
            clear();
        }

        public static AssetsRemove[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new AssetsRemove[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static AssetsRemove parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (AssetsRemove) sia.mergeFrom(new AssetsRemove(), bArr);
        }

        public AssetsRemove clear() {
            this.requestId = 0L;
            this.assetType = 0;
            this.id = 0L;
            this.ids = sb8.f;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int i = 0;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            int i2 = this.assetType;
            if (i2 != 0) {
                iH += uu3.f(2, i2);
            }
            long j2 = this.id;
            if (j2 != 0) {
                iH += uu3.h(3, j2);
            }
            long[] jArr = this.ids;
            if (jArr == null || jArr.length <= 0) {
                return iH;
            }
            int iK = 0;
            while (true) {
                long[] jArr2 = this.ids;
                if (i >= jArr2.length) {
                    return iH + iK + jArr2.length;
                }
                iK += uu3.k(jArr2[i]);
                i++;
            }
        }

        @Override // defpackage.sia
        public AssetsRemove mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    int iP = su3Var.p();
                    if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4 || iP == 5) {
                        this.assetType = iP;
                    }
                } else if (iS == 24) {
                    this.id = su3Var.q();
                } else if (iS == 32) {
                    int I = sb8.I(su3Var, 32);
                    long[] jArr = this.ids;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = I + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = su3Var.q();
                        su3Var.s();
                        length++;
                    }
                    jArr2[length] = su3Var.q();
                    this.ids = jArr2;
                } else if (iS == 34) {
                    int iE = su3Var.e(su3Var.p());
                    int iC = su3Var.c();
                    int i2 = 0;
                    while (su3Var.b() > 0) {
                        su3Var.q();
                        i2++;
                    }
                    su3Var.t(iC);
                    long[] jArr3 = this.ids;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = su3Var.q();
                        length2++;
                    }
                    this.ids = jArr4;
                    su3Var.d(iE);
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            int i = this.assetType;
            if (i != 0) {
                uu3Var.w(2, i);
            }
            long j2 = this.id;
            if (j2 != 0) {
                uu3Var.x(3, j2);
            }
            long[] jArr = this.ids;
            if (jArr == null || jArr.length <= 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long[] jArr2 = this.ids;
                if (i2 >= jArr2.length) {
                    return;
                }
                uu3Var.x(4, jArr2[i2]);
                i2++;
            }
        }

        public static AssetsRemove parseFrom(su3 su3Var) throws IOException {
            return new AssetsRemove().mergeFrom(su3Var);
        }
    }

    public static final class CallHistoryClearBatch extends sia {
        private static volatile CallHistoryClearBatch[] _emptyArray;
        public long[] historyIds;
        public long lastFailTime;
        public long taskId;

        public CallHistoryClearBatch() {
            clear();
        }

        public static CallHistoryClearBatch[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new CallHistoryClearBatch[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static CallHistoryClearBatch parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (CallHistoryClearBatch) sia.mergeFrom(new CallHistoryClearBatch(), bArr);
        }

        public CallHistoryClearBatch clear() {
            this.taskId = 0L;
            this.historyIds = sb8.f;
            this.lastFailTime = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long[] jArr;
            long j = this.taskId;
            int i = 0;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long[] jArr2 = this.historyIds;
            if (jArr2 != null && jArr2.length > 0) {
                int iK = 0;
                while (true) {
                    jArr = this.historyIds;
                    if (i >= jArr.length) {
                        break;
                    }
                    iK += uu3.k(jArr[i]);
                    i++;
                }
                iH = iH + iK + jArr.length;
            }
            long j2 = this.lastFailTime;
            return j2 != 0 ? uu3.h(3, j2) + iH : iH;
        }

        @Override // defpackage.sia
        public CallHistoryClearBatch mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.taskId = su3Var.q();
                } else if (iS == 16) {
                    int I = sb8.I(su3Var, 16);
                    long[] jArr = this.historyIds;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = I + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = su3Var.q();
                        su3Var.s();
                        length++;
                    }
                    jArr2[length] = su3Var.q();
                    this.historyIds = jArr2;
                } else if (iS == 18) {
                    int iE = su3Var.e(su3Var.p());
                    int iC = su3Var.c();
                    int i2 = 0;
                    while (su3Var.b() > 0) {
                        su3Var.q();
                        i2++;
                    }
                    su3Var.t(iC);
                    long[] jArr3 = this.historyIds;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = su3Var.q();
                        length2++;
                    }
                    this.historyIds = jArr4;
                    su3Var.d(iE);
                } else if (iS == 24) {
                    this.lastFailTime = su3Var.q();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.taskId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long[] jArr = this.historyIds;
            if (jArr != null && jArr.length > 0) {
                int i = 0;
                while (true) {
                    long[] jArr2 = this.historyIds;
                    if (i >= jArr2.length) {
                        break;
                    }
                    uu3Var.x(2, jArr2[i]);
                    i++;
                }
            }
            long j2 = this.lastFailTime;
            if (j2 != 0) {
                uu3Var.x(3, j2);
            }
        }

        public static CallHistoryClearBatch parseFrom(su3 su3Var) throws IOException {
            return new CallHistoryClearBatch().mergeFrom(su3Var);
        }
    }

    public static final class ChangeChatPhoto extends sia {
        private static volatile ChangeChatPhoto[] _emptyArray;
        public long chatId;
        public Rect crop;
        public String file;
        public long lastModified;
        public long requestId;

        public ChangeChatPhoto() {
            clear();
        }

        public static ChangeChatPhoto[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChangeChatPhoto[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChangeChatPhoto parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChangeChatPhoto) sia.mergeFrom(new ChangeChatPhoto(), bArr);
        }

        public ChangeChatPhoto clear() {
            this.requestId = 0L;
            this.file = "";
            this.chatId = 0L;
            this.crop = null;
            this.lastModified = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            if (!this.file.equals("")) {
                iH += uu3.l(2, this.file);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += uu3.h(3, j2);
            }
            Rect rect = this.crop;
            if (rect != null) {
                iH += uu3.i(4, rect);
            }
            long j3 = this.lastModified;
            return j3 != 0 ? uu3.h(5, j3) + iH : iH;
        }

        @Override // defpackage.sia
        public ChangeChatPhoto mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 18) {
                    this.file = su3Var.r();
                } else if (iS == 24) {
                    this.chatId = su3Var.q();
                } else if (iS == 34) {
                    if (this.crop == null) {
                        this.crop = new Rect();
                    }
                    su3Var.j(this.crop);
                } else if (iS == 40) {
                    this.lastModified = su3Var.q();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            if (!this.file.equals("")) {
                uu3Var.E(2, this.file);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                uu3Var.x(3, j2);
            }
            Rect rect = this.crop;
            if (rect != null) {
                uu3Var.y(4, rect);
            }
            long j3 = this.lastModified;
            if (j3 != 0) {
                uu3Var.x(5, j3);
            }
        }

        public static ChangeChatPhoto parseFrom(su3 su3Var) throws IOException {
            return new ChangeChatPhoto().mergeFrom(su3Var);
        }
    }

    public static final class ChangeProfileOrChatPhoto extends sia {
        private static volatile ChangeProfileOrChatPhoto[] _emptyArray;
        public long chatId;
        public Rect crop;
        public String file;
        public long lastModified;
        public long requestId;

        public ChangeProfileOrChatPhoto() {
            clear();
        }

        public static ChangeProfileOrChatPhoto[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChangeProfileOrChatPhoto[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChangeProfileOrChatPhoto parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChangeProfileOrChatPhoto) sia.mergeFrom(new ChangeProfileOrChatPhoto(), bArr);
        }

        public ChangeProfileOrChatPhoto clear() {
            this.requestId = 0L;
            this.file = "";
            this.chatId = 0L;
            this.crop = null;
            this.lastModified = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            if (!this.file.equals("")) {
                iH += uu3.l(2, this.file);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += uu3.h(3, j2);
            }
            Rect rect = this.crop;
            if (rect != null) {
                iH += uu3.i(4, rect);
            }
            long j3 = this.lastModified;
            return j3 != 0 ? uu3.h(5, j3) + iH : iH;
        }

        @Override // defpackage.sia
        public ChangeProfileOrChatPhoto mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 18) {
                    this.file = su3Var.r();
                } else if (iS == 24) {
                    this.chatId = su3Var.q();
                } else if (iS == 34) {
                    if (this.crop == null) {
                        this.crop = new Rect();
                    }
                    su3Var.j(this.crop);
                } else if (iS == 40) {
                    this.lastModified = su3Var.q();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            if (!this.file.equals("")) {
                uu3Var.E(2, this.file);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                uu3Var.x(3, j2);
            }
            Rect rect = this.crop;
            if (rect != null) {
                uu3Var.y(4, rect);
            }
            long j3 = this.lastModified;
            if (j3 != 0) {
                uu3Var.x(5, j3);
            }
        }

        public static ChangeProfileOrChatPhoto parseFrom(su3 su3Var) throws IOException {
            return new ChangeProfileOrChatPhoto().mergeFrom(su3Var);
        }
    }

    public static final class ChannelLeave extends sia {
        private static volatile ChannelLeave[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public long requestId;

        public ChannelLeave() {
            clear();
        }

        public static ChannelLeave[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChannelLeave[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChannelLeave parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChannelLeave) sia.mergeFrom(new ChannelLeave(), bArr);
        }

        public ChannelLeave clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            long j3 = this.chatServerId;
            return j3 != 0 ? uu3.h(3, j3) + iH : iH;
        }

        @Override // defpackage.sia
        public ChannelLeave mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    this.chatId = su3Var.q();
                } else if (iS == 24) {
                    this.chatServerId = su3Var.q();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                uu3Var.x(3, j3);
            }
        }

        public static ChannelLeave parseFrom(su3 su3Var) throws IOException {
            return new ChannelLeave().mergeFrom(su3Var);
        }
    }

    public static final class ChatClear extends sia {
        private static volatile ChatClear[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public boolean forAll;
        public long lastEventTime;
        public long requestId;

        public ChatClear() {
            clear();
        }

        public static ChatClear[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatClear[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatClear parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatClear) sia.mergeFrom(new ChatClear(), bArr);
        }

        public ChatClear clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.lastEventTime = 0L;
            this.forAll = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                iH += uu3.h(3, j3);
            }
            long j4 = this.lastEventTime;
            if (j4 != 0) {
                iH += uu3.h(4, j4);
            }
            return this.forAll ? uu3.a(5) + iH : iH;
        }

        @Override // defpackage.sia
        public ChatClear mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    this.chatId = su3Var.q();
                } else if (iS == 24) {
                    this.chatServerId = su3Var.q();
                } else if (iS == 32) {
                    this.lastEventTime = su3Var.q();
                } else if (iS == 40) {
                    this.forAll = su3Var.f();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                uu3Var.x(3, j3);
            }
            long j4 = this.lastEventTime;
            if (j4 != 0) {
                uu3Var.x(4, j4);
            }
            boolean z = this.forAll;
            if (z) {
                uu3Var.r(5, z);
            }
        }

        public static ChatClear parseFrom(su3 su3Var) throws IOException {
            return new ChatClear().mergeFrom(su3Var);
        }
    }

    public static final class ChatComplain extends sia {
        private static volatile ChatComplain[] _emptyArray;
        public long chatId;
        public String complaint;
        public long requestId;

        public ChatComplain() {
            clear();
        }

        public static ChatComplain[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatComplain[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatComplain parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatComplain) sia.mergeFrom(new ChatComplain(), bArr);
        }

        public ChatComplain clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.complaint = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            return !this.complaint.equals("") ? uu3.l(3, this.complaint) + iH : iH;
        }

        @Override // defpackage.sia
        public ChatComplain mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    this.chatId = su3Var.q();
                } else if (iS == 26) {
                    this.complaint = su3Var.r();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            if (this.complaint.equals("")) {
                return;
            }
            uu3Var.E(3, this.complaint);
        }

        public static ChatComplain parseFrom(su3 su3Var) throws IOException {
            return new ChatComplain().mergeFrom(su3Var);
        }
    }

    public static final class ChatDelete extends sia {
        private static volatile ChatDelete[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public boolean forAll;
        public long lastEventTime;
        public long requestId;

        public ChatDelete() {
            clear();
        }

        public static ChatDelete[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatDelete[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatDelete parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatDelete) sia.mergeFrom(new ChatDelete(), bArr);
        }

        public ChatDelete clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.lastEventTime = 0L;
            this.forAll = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                iH += uu3.h(3, j3);
            }
            long j4 = this.lastEventTime;
            if (j4 != 0) {
                iH += uu3.h(4, j4);
            }
            return this.forAll ? uu3.a(5) + iH : iH;
        }

        @Override // defpackage.sia
        public ChatDelete mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    this.chatId = su3Var.q();
                } else if (iS == 24) {
                    this.chatServerId = su3Var.q();
                } else if (iS == 32) {
                    this.lastEventTime = su3Var.q();
                } else if (iS == 40) {
                    this.forAll = su3Var.f();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                uu3Var.x(3, j3);
            }
            long j4 = this.lastEventTime;
            if (j4 != 0) {
                uu3Var.x(4, j4);
            }
            boolean z = this.forAll;
            if (z) {
                uu3Var.r(5, z);
            }
        }

        public static ChatDelete parseFrom(su3 su3Var) throws IOException {
            return new ChatDelete().mergeFrom(su3Var);
        }
    }

    public static final class ChatHide extends sia {
        private static volatile ChatHide[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public long requestId;

        public ChatHide() {
            clear();
        }

        public static ChatHide[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatHide[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatHide parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatHide) sia.mergeFrom(new ChatHide(), bArr);
        }

        public ChatHide clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            long j3 = this.chatServerId;
            return j3 != 0 ? uu3.h(3, j3) + iH : iH;
        }

        @Override // defpackage.sia
        public ChatHide mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    this.chatId = su3Var.q();
                } else if (iS == 24) {
                    this.chatServerId = su3Var.q();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                uu3Var.x(3, j3);
            }
        }

        public static ChatHide parseFrom(su3 su3Var) throws IOException {
            return new ChatHide().mergeFrom(su3Var);
        }
    }

    public static final class ChatMark extends sia {
        private static volatile ChatMark[] _emptyArray;
        public boolean awaitChatInCache;
        public long chatId;
        public long chatServerId;
        public boolean isReadReaction;
        public long mark;
        public long messageId;
        public long requestId;
        public boolean setAsUnread;

        public ChatMark() {
            clear();
        }

        public static ChatMark[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatMark[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatMark parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatMark) sia.mergeFrom(new ChatMark(), bArr);
        }

        public ChatMark clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.mark = 0L;
            this.messageId = 0L;
            this.setAsUnread = false;
            this.awaitChatInCache = false;
            this.isReadReaction = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                iH += uu3.h(3, j3);
            }
            long j4 = this.mark;
            if (j4 != 0) {
                iH += uu3.h(4, j4);
            }
            long j5 = this.messageId;
            if (j5 != 0) {
                iH += uu3.h(5, j5);
            }
            if (this.setAsUnread) {
                iH += uu3.a(6);
            }
            if (this.awaitChatInCache) {
                iH += uu3.a(7);
            }
            return this.isReadReaction ? uu3.a(8) + iH : iH;
        }

        @Override // defpackage.sia
        public ChatMark mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    this.chatId = su3Var.q();
                } else if (iS == 24) {
                    this.chatServerId = su3Var.q();
                } else if (iS == 32) {
                    this.mark = su3Var.q();
                } else if (iS == 40) {
                    this.messageId = su3Var.q();
                } else if (iS == 48) {
                    this.setAsUnread = su3Var.f();
                } else if (iS == 56) {
                    this.awaitChatInCache = su3Var.f();
                } else if (iS == 64) {
                    this.isReadReaction = su3Var.f();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                uu3Var.x(3, j3);
            }
            long j4 = this.mark;
            if (j4 != 0) {
                uu3Var.x(4, j4);
            }
            long j5 = this.messageId;
            if (j5 != 0) {
                uu3Var.x(5, j5);
            }
            boolean z = this.setAsUnread;
            if (z) {
                uu3Var.r(6, z);
            }
            boolean z2 = this.awaitChatInCache;
            if (z2) {
                uu3Var.r(7, z2);
            }
            boolean z3 = this.isReadReaction;
            if (z3) {
                uu3Var.r(8, z3);
            }
        }

        public static ChatMark parseFrom(su3 su3Var) throws IOException {
            return new ChatMark().mergeFrom(su3Var);
        }
    }

    public static final class ChatMarkBatch extends sia {
        private static volatile ChatMarkBatch[] _emptyArray;
        public long[] chatIds;
        public long lastFailTime;
        public long maxMark;
        public long taskId;

        public ChatMarkBatch() {
            clear();
        }

        public static ChatMarkBatch[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatMarkBatch[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatMarkBatch parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatMarkBatch) sia.mergeFrom(new ChatMarkBatch(), bArr);
        }

        public ChatMarkBatch clear() {
            this.taskId = 0L;
            this.chatIds = sb8.f;
            this.maxMark = 0L;
            this.lastFailTime = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long[] jArr;
            long j = this.taskId;
            int i = 0;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long[] jArr2 = this.chatIds;
            if (jArr2 != null && jArr2.length > 0) {
                int iK = 0;
                while (true) {
                    jArr = this.chatIds;
                    if (i >= jArr.length) {
                        break;
                    }
                    iK += uu3.k(jArr[i]);
                    i++;
                }
                iH = iH + iK + jArr.length;
            }
            long j2 = this.maxMark;
            if (j2 != 0) {
                iH += uu3.h(3, j2);
            }
            long j3 = this.lastFailTime;
            return j3 != 0 ? uu3.h(4, j3) + iH : iH;
        }

        @Override // defpackage.sia
        public ChatMarkBatch mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.taskId = su3Var.q();
                } else if (iS == 16) {
                    int I = sb8.I(su3Var, 16);
                    long[] jArr = this.chatIds;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = I + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = su3Var.q();
                        su3Var.s();
                        length++;
                    }
                    jArr2[length] = su3Var.q();
                    this.chatIds = jArr2;
                } else if (iS == 18) {
                    int iE = su3Var.e(su3Var.p());
                    int iC = su3Var.c();
                    int i2 = 0;
                    while (su3Var.b() > 0) {
                        su3Var.q();
                        i2++;
                    }
                    su3Var.t(iC);
                    long[] jArr3 = this.chatIds;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = su3Var.q();
                        length2++;
                    }
                    this.chatIds = jArr4;
                    su3Var.d(iE);
                } else if (iS == 24) {
                    this.maxMark = su3Var.q();
                } else if (iS == 32) {
                    this.lastFailTime = su3Var.q();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.taskId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long[] jArr = this.chatIds;
            if (jArr != null && jArr.length > 0) {
                int i = 0;
                while (true) {
                    long[] jArr2 = this.chatIds;
                    if (i >= jArr2.length) {
                        break;
                    }
                    uu3Var.x(2, jArr2[i]);
                    i++;
                }
            }
            long j2 = this.maxMark;
            if (j2 != 0) {
                uu3Var.x(3, j2);
            }
            long j3 = this.lastFailTime;
            if (j3 != 0) {
                uu3Var.x(4, j3);
            }
        }

        public static ChatMarkBatch parseFrom(su3 su3Var) throws IOException {
            return new ChatMarkBatch().mergeFrom(su3Var);
        }
    }

    public static final class ChatMembersUpdate extends sia {
        private static volatile ChatMembersUpdate[] _emptyArray;
        public long chatId;
        public String chatMemberType;
        public long chatServerId;
        public int cleanMsgPeriod;
        public long messageId;
        public String operation;
        public long postId;
        public long requestId;
        public boolean showHistory;
        public long[] userIds;

        public ChatMembersUpdate() {
            clear();
        }

        public static ChatMembersUpdate[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatMembersUpdate[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatMembersUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatMembersUpdate) sia.mergeFrom(new ChatMembersUpdate(), bArr);
        }

        public ChatMembersUpdate clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.operation = "";
            this.userIds = sb8.f;
            this.chatMemberType = "";
            this.showHistory = false;
            this.postId = 0L;
            this.messageId = 0L;
            this.cleanMsgPeriod = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long[] jArr;
            long j = this.requestId;
            int i = 0;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                iH += uu3.h(3, j3);
            }
            if (!this.operation.equals("")) {
                iH += uu3.l(4, this.operation);
            }
            long[] jArr2 = this.userIds;
            if (jArr2 != null && jArr2.length > 0) {
                int iK = 0;
                while (true) {
                    jArr = this.userIds;
                    if (i >= jArr.length) {
                        break;
                    }
                    iK += uu3.k(jArr[i]);
                    i++;
                }
                iH = iH + iK + jArr.length;
            }
            if (!this.chatMemberType.equals("")) {
                iH += uu3.l(6, this.chatMemberType);
            }
            if (this.showHistory) {
                iH += uu3.a(7);
            }
            long j4 = this.postId;
            if (j4 != 0) {
                iH += uu3.h(8, j4);
            }
            long j5 = this.messageId;
            if (j5 != 0) {
                iH += uu3.h(9, j5);
            }
            int i2 = this.cleanMsgPeriod;
            return i2 != 0 ? uu3.f(10, i2) + iH : iH;
        }

        @Override // defpackage.sia
        public ChatMembersUpdate mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                switch (iS) {
                    case 0:
                        break;
                    case 8:
                        this.requestId = su3Var.q();
                        break;
                    case 16:
                        this.chatId = su3Var.q();
                        break;
                    case 24:
                        this.chatServerId = su3Var.q();
                        break;
                    case 34:
                        this.operation = su3Var.r();
                        break;
                    case 40:
                        int I = sb8.I(su3Var, 40);
                        long[] jArr = this.userIds;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = I + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = su3Var.q();
                            su3Var.s();
                            length++;
                        }
                        jArr2[length] = su3Var.q();
                        this.userIds = jArr2;
                        break;
                    case 42:
                        int iE = su3Var.e(su3Var.p());
                        int iC = su3Var.c();
                        int i2 = 0;
                        while (su3Var.b() > 0) {
                            su3Var.q();
                            i2++;
                        }
                        su3Var.t(iC);
                        long[] jArr3 = this.userIds;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = su3Var.q();
                            length2++;
                        }
                        this.userIds = jArr4;
                        su3Var.d(iE);
                        break;
                    case 50:
                        this.chatMemberType = su3Var.r();
                        break;
                    case 56:
                        this.showHistory = su3Var.f();
                        break;
                    case 64:
                        this.postId = su3Var.q();
                        break;
                    case 72:
                        this.messageId = su3Var.q();
                        break;
                    case 80:
                        this.cleanMsgPeriod = su3Var.p();
                        break;
                    default:
                        if (!su3Var.u(iS)) {
                        }
                        break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                uu3Var.x(3, j3);
            }
            if (!this.operation.equals("")) {
                uu3Var.E(4, this.operation);
            }
            long[] jArr = this.userIds;
            if (jArr != null && jArr.length > 0) {
                int i = 0;
                while (true) {
                    long[] jArr2 = this.userIds;
                    if (i >= jArr2.length) {
                        break;
                    }
                    uu3Var.x(5, jArr2[i]);
                    i++;
                }
            }
            if (!this.chatMemberType.equals("")) {
                uu3Var.E(6, this.chatMemberType);
            }
            boolean z = this.showHistory;
            if (z) {
                uu3Var.r(7, z);
            }
            long j4 = this.postId;
            if (j4 != 0) {
                uu3Var.x(8, j4);
            }
            long j5 = this.messageId;
            if (j5 != 0) {
                uu3Var.x(9, j5);
            }
            int i2 = this.cleanMsgPeriod;
            if (i2 != 0) {
                uu3Var.w(10, i2);
            }
        }

        public static ChatMembersUpdate parseFrom(su3 su3Var) throws IOException {
            return new ChatMembersUpdate().mergeFrom(su3Var);
        }
    }

    public static final class ChatPersonalConfig extends sia {
        private static volatile ChatPersonalConfig[] _emptyArray;
        public long chatId;
        public boolean hideNonContactBar;
        public long requestId;

        public ChatPersonalConfig() {
            clear();
        }

        public static ChatPersonalConfig[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatPersonalConfig[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatPersonalConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatPersonalConfig) sia.mergeFrom(new ChatPersonalConfig(), bArr);
        }

        public ChatPersonalConfig clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.hideNonContactBar = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            return this.hideNonContactBar ? uu3.a(3) + iH : iH;
        }

        @Override // defpackage.sia
        public ChatPersonalConfig mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    this.chatId = su3Var.q();
                } else if (iS == 24) {
                    this.hideNonContactBar = su3Var.f();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            boolean z = this.hideNonContactBar;
            if (z) {
                uu3Var.r(3, z);
            }
        }

        public static ChatPersonalConfig parseFrom(su3 su3Var) throws IOException {
            return new ChatPersonalConfig().mergeFrom(su3Var);
        }
    }

    public static final class ChatPinSetVisibility extends sia {
        private static volatile ChatPinSetVisibility[] _emptyArray;
        public long chatServerId;
        public long requestId;
        public boolean show;

        public ChatPinSetVisibility() {
            clear();
        }

        public static ChatPinSetVisibility[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatPinSetVisibility[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatPinSetVisibility parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatPinSetVisibility) sia.mergeFrom(new ChatPinSetVisibility(), bArr);
        }

        public ChatPinSetVisibility clear() {
            this.requestId = 0L;
            this.chatServerId = 0L;
            this.show = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.chatServerId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            return this.show ? uu3.a(3) + iH : iH;
        }

        @Override // defpackage.sia
        public ChatPinSetVisibility mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    this.chatServerId = su3Var.q();
                } else if (iS == 24) {
                    this.show = su3Var.f();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.chatServerId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            boolean z = this.show;
            if (z) {
                uu3Var.r(3, z);
            }
        }

        public static ChatPinSetVisibility parseFrom(su3 su3Var) throws IOException {
            return new ChatPinSetVisibility().mergeFrom(su3Var);
        }
    }

    public static final class ChatUpdate extends sia {
        private static volatile ChatUpdate[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public Rect crop;
        public String description;
        public boolean descriptionIsNull;
        public boolean notifyPin;
        public String photoToken;
        public boolean photoTokenIsNull;
        public long pinMessageId;
        public boolean pinMessageIdIsNull;
        public long requestId;
        public String theme;
        public boolean themeIsNull;

        public ChatUpdate() {
            clear();
        }

        public static ChatUpdate[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatUpdate[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatUpdate) sia.mergeFrom(new ChatUpdate(), bArr);
        }

        public ChatUpdate clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.theme = "";
            this.photoToken = "";
            this.crop = null;
            this.themeIsNull = false;
            this.photoTokenIsNull = false;
            this.pinMessageId = 0L;
            this.notifyPin = false;
            this.pinMessageIdIsNull = false;
            this.description = "";
            this.descriptionIsNull = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                iH += uu3.h(3, j3);
            }
            if (!this.theme.equals("")) {
                iH += uu3.l(4, this.theme);
            }
            if (!this.photoToken.equals("")) {
                iH += uu3.l(5, this.photoToken);
            }
            Rect rect = this.crop;
            if (rect != null) {
                iH += uu3.i(6, rect);
            }
            if (this.themeIsNull) {
                iH += uu3.a(7);
            }
            if (this.photoTokenIsNull) {
                iH += uu3.a(8);
            }
            long j4 = this.pinMessageId;
            if (j4 != 0) {
                iH += uu3.h(9, j4);
            }
            if (this.notifyPin) {
                iH += uu3.a(10);
            }
            if (this.pinMessageIdIsNull) {
                iH += uu3.a(11);
            }
            if (!this.description.equals("")) {
                iH += uu3.l(12, this.description);
            }
            return this.descriptionIsNull ? uu3.a(13) + iH : iH;
        }

        @Override // defpackage.sia
        public ChatUpdate mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                switch (iS) {
                    case 0:
                        break;
                    case 8:
                        this.requestId = su3Var.q();
                        break;
                    case 16:
                        this.chatId = su3Var.q();
                        break;
                    case 24:
                        this.chatServerId = su3Var.q();
                        break;
                    case 34:
                        this.theme = su3Var.r();
                        break;
                    case 42:
                        this.photoToken = su3Var.r();
                        break;
                    case 50:
                        if (this.crop == null) {
                            this.crop = new Rect();
                        }
                        su3Var.j(this.crop);
                        break;
                    case 56:
                        this.themeIsNull = su3Var.f();
                        break;
                    case 64:
                        this.photoTokenIsNull = su3Var.f();
                        break;
                    case 72:
                        this.pinMessageId = su3Var.q();
                        break;
                    case 80:
                        this.notifyPin = su3Var.f();
                        break;
                    case 88:
                        this.pinMessageIdIsNull = su3Var.f();
                        break;
                    case 98:
                        this.description = su3Var.r();
                        break;
                    case AidlException.SDK_IS_NOT_INITIALIZED /* 104 */:
                        this.descriptionIsNull = su3Var.f();
                        break;
                    default:
                        if (!su3Var.u(iS)) {
                        }
                        break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                uu3Var.x(3, j3);
            }
            if (!this.theme.equals("")) {
                uu3Var.E(4, this.theme);
            }
            if (!this.photoToken.equals("")) {
                uu3Var.E(5, this.photoToken);
            }
            Rect rect = this.crop;
            if (rect != null) {
                uu3Var.y(6, rect);
            }
            boolean z = this.themeIsNull;
            if (z) {
                uu3Var.r(7, z);
            }
            boolean z2 = this.photoTokenIsNull;
            if (z2) {
                uu3Var.r(8, z2);
            }
            long j4 = this.pinMessageId;
            if (j4 != 0) {
                uu3Var.x(9, j4);
            }
            boolean z3 = this.notifyPin;
            if (z3) {
                uu3Var.r(10, z3);
            }
            boolean z4 = this.pinMessageIdIsNull;
            if (z4) {
                uu3Var.r(11, z4);
            }
            if (!this.description.equals("")) {
                uu3Var.E(12, this.description);
            }
            boolean z5 = this.descriptionIsNull;
            if (z5) {
                uu3Var.r(13, z5);
            }
        }

        public static ChatUpdate parseFrom(su3 su3Var) throws IOException {
            return new ChatUpdate().mergeFrom(su3Var);
        }
    }

    public static final class ChatsList extends sia {
        private static volatile ChatsList[] _emptyArray;
        public long chatsSync;
        public int count;
        public long marker;
        public long requestId;

        public ChatsList() {
            clear();
        }

        public static ChatsList[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatsList[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatsList parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatsList) sia.mergeFrom(new ChatsList(), bArr);
        }

        public ChatsList clear() {
            this.requestId = 0L;
            this.marker = 0L;
            this.count = 0;
            this.chatsSync = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.marker;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            int i = this.count;
            if (i != 0) {
                iH += uu3.f(3, i);
            }
            long j3 = this.chatsSync;
            return j3 != 0 ? uu3.h(4, j3) + iH : iH;
        }

        @Override // defpackage.sia
        public ChatsList mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    this.marker = su3Var.q();
                } else if (iS == 24) {
                    this.count = su3Var.p();
                } else if (iS == 32) {
                    this.chatsSync = su3Var.q();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.marker;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            int i = this.count;
            if (i != 0) {
                uu3Var.w(3, i);
            }
            long j3 = this.chatsSync;
            if (j3 != 0) {
                uu3Var.x(4, j3);
            }
        }

        public static ChatsList parseFrom(su3 su3Var) throws IOException {
            return new ChatsList().mergeFrom(su3Var);
        }
    }

    public static final class CommentDelete extends sia {
        private static volatile CommentDelete[] _emptyArray;
        public String complaint;
        public long[] messagesId;
        public long[] messagesServerId;
        public long parentChatServerId;
        public long parentMessageServerId;
        public long requestId;

        public CommentDelete() {
            clear();
        }

        public static CommentDelete[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new CommentDelete[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static CommentDelete parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (CommentDelete) sia.mergeFrom(new CommentDelete(), bArr);
        }

        public CommentDelete clear() {
            this.requestId = 0L;
            this.parentChatServerId = 0L;
            this.parentMessageServerId = 0L;
            long[] jArr = sb8.f;
            this.messagesId = jArr;
            this.messagesServerId = jArr;
            this.complaint = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long[] jArr;
            long[] jArr2;
            long j = this.requestId;
            int i = 0;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.parentChatServerId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            long j3 = this.parentMessageServerId;
            if (j3 != 0) {
                iH += uu3.h(3, j3);
            }
            long[] jArr3 = this.messagesId;
            if (jArr3 != null && jArr3.length > 0) {
                int i2 = 0;
                int iK = 0;
                while (true) {
                    jArr2 = this.messagesId;
                    if (i2 >= jArr2.length) {
                        break;
                    }
                    iK += uu3.k(jArr2[i2]);
                    i2++;
                }
                iH = iH + iK + jArr2.length;
            }
            long[] jArr4 = this.messagesServerId;
            if (jArr4 != null && jArr4.length > 0) {
                int iK2 = 0;
                while (true) {
                    jArr = this.messagesServerId;
                    if (i >= jArr.length) {
                        break;
                    }
                    iK2 += uu3.k(jArr[i]);
                    i++;
                }
                iH = iH + iK2 + jArr.length;
            }
            return !this.complaint.equals("") ? uu3.l(6, this.complaint) + iH : iH;
        }

        @Override // defpackage.sia
        public CommentDelete mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    this.parentChatServerId = su3Var.q();
                } else if (iS == 24) {
                    this.parentMessageServerId = su3Var.q();
                } else if (iS == 32) {
                    int I = sb8.I(su3Var, 32);
                    long[] jArr = this.messagesId;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = I + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = su3Var.q();
                        su3Var.s();
                        length++;
                    }
                    jArr2[length] = su3Var.q();
                    this.messagesId = jArr2;
                } else if (iS == 34) {
                    int iE = su3Var.e(su3Var.p());
                    int iC = su3Var.c();
                    int i2 = 0;
                    while (su3Var.b() > 0) {
                        su3Var.q();
                        i2++;
                    }
                    su3Var.t(iC);
                    long[] jArr3 = this.messagesId;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = su3Var.q();
                        length2++;
                    }
                    this.messagesId = jArr4;
                    su3Var.d(iE);
                } else if (iS == 40) {
                    int I2 = sb8.I(su3Var, 40);
                    long[] jArr5 = this.messagesServerId;
                    int length3 = jArr5 == null ? 0 : jArr5.length;
                    int i4 = I2 + length3;
                    long[] jArr6 = new long[i4];
                    if (length3 != 0) {
                        System.arraycopy(jArr5, 0, jArr6, 0, length3);
                    }
                    while (length3 < i4 - 1) {
                        jArr6[length3] = su3Var.q();
                        su3Var.s();
                        length3++;
                    }
                    jArr6[length3] = su3Var.q();
                    this.messagesServerId = jArr6;
                } else if (iS == 42) {
                    int iE2 = su3Var.e(su3Var.p());
                    int iC2 = su3Var.c();
                    int i5 = 0;
                    while (su3Var.b() > 0) {
                        su3Var.q();
                        i5++;
                    }
                    su3Var.t(iC2);
                    long[] jArr7 = this.messagesServerId;
                    int length4 = jArr7 == null ? 0 : jArr7.length;
                    int i6 = i5 + length4;
                    long[] jArr8 = new long[i6];
                    if (length4 != 0) {
                        System.arraycopy(jArr7, 0, jArr8, 0, length4);
                    }
                    while (length4 < i6) {
                        jArr8[length4] = su3Var.q();
                        length4++;
                    }
                    this.messagesServerId = jArr8;
                    su3Var.d(iE2);
                } else if (iS == 50) {
                    this.complaint = su3Var.r();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.parentChatServerId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            long j3 = this.parentMessageServerId;
            if (j3 != 0) {
                uu3Var.x(3, j3);
            }
            long[] jArr = this.messagesId;
            int i = 0;
            if (jArr != null && jArr.length > 0) {
                int i2 = 0;
                while (true) {
                    long[] jArr2 = this.messagesId;
                    if (i2 >= jArr2.length) {
                        break;
                    }
                    uu3Var.x(4, jArr2[i2]);
                    i2++;
                }
            }
            long[] jArr3 = this.messagesServerId;
            if (jArr3 != null && jArr3.length > 0) {
                while (true) {
                    long[] jArr4 = this.messagesServerId;
                    if (i >= jArr4.length) {
                        break;
                    }
                    uu3Var.x(5, jArr4[i]);
                    i++;
                }
            }
            if (this.complaint.equals("")) {
                return;
            }
            uu3Var.E(6, this.complaint);
        }

        public static CommentDelete parseFrom(su3 su3Var) throws IOException {
            return new CommentDelete().mergeFrom(su3Var);
        }
    }

    public static final class CommentDeleteUser extends sia {
        private static volatile CommentDeleteUser[] _emptyArray;
        public long chatServerId;
        public long messageServerId;
        public long postServerId;
        public long requestId;
        public long userId;

        public CommentDeleteUser() {
            clear();
        }

        public static CommentDeleteUser[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new CommentDeleteUser[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static CommentDeleteUser parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (CommentDeleteUser) sia.mergeFrom(new CommentDeleteUser(), bArr);
        }

        public CommentDeleteUser clear() {
            this.requestId = 0L;
            this.chatServerId = 0L;
            this.userId = 0L;
            this.postServerId = 0L;
            this.messageServerId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.chatServerId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            long j3 = this.userId;
            if (j3 != 0) {
                iH += uu3.h(3, j3);
            }
            long j4 = this.postServerId;
            if (j4 != 0) {
                iH += uu3.h(4, j4);
            }
            long j5 = this.messageServerId;
            return j5 != 0 ? uu3.h(5, j5) + iH : iH;
        }

        @Override // defpackage.sia
        public CommentDeleteUser mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    this.chatServerId = su3Var.q();
                } else if (iS == 24) {
                    this.userId = su3Var.q();
                } else if (iS == 32) {
                    this.postServerId = su3Var.q();
                } else if (iS == 40) {
                    this.messageServerId = su3Var.q();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.chatServerId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            long j3 = this.userId;
            if (j3 != 0) {
                uu3Var.x(3, j3);
            }
            long j4 = this.postServerId;
            if (j4 != 0) {
                uu3Var.x(4, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                uu3Var.x(5, j5);
            }
        }

        public static CommentDeleteUser parseFrom(su3 su3Var) throws IOException {
            return new CommentDeleteUser().mergeFrom(su3Var);
        }
    }

    public static final class CommentEdit extends sia {
        private static volatile CommentEdit[] _emptyArray;
        public long commentId;
        public boolean isOldTextNull;
        public boolean isTextNull;
        public Protos.MessageElements oldElements;
        public int oldStatus;
        public String oldText;
        public long parentChatServerId;
        public long parentMessageServerId;
        public long requestId;
        public String text;

        public CommentEdit() {
            clear();
        }

        public static CommentEdit[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new CommentEdit[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static CommentEdit parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (CommentEdit) sia.mergeFrom(new CommentEdit(), bArr);
        }

        public CommentEdit clear() {
            this.requestId = 0L;
            this.parentChatServerId = 0L;
            this.parentMessageServerId = 0L;
            this.commentId = 0L;
            this.text = "";
            this.isTextNull = false;
            this.oldText = "";
            this.isOldTextNull = false;
            this.oldStatus = 0;
            this.oldElements = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.parentChatServerId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            long j3 = this.parentMessageServerId;
            if (j3 != 0) {
                iH += uu3.h(3, j3);
            }
            long j4 = this.commentId;
            if (j4 != 0) {
                iH += uu3.h(4, j4);
            }
            if (!this.text.equals("")) {
                iH += uu3.l(5, this.text);
            }
            if (this.isTextNull) {
                iH += uu3.a(6);
            }
            if (!this.oldText.equals("")) {
                iH += uu3.l(7, this.oldText);
            }
            if (this.isOldTextNull) {
                iH += uu3.a(8);
            }
            int i = this.oldStatus;
            if (i != 0) {
                iH += uu3.f(9, i);
            }
            Protos.MessageElements messageElements = this.oldElements;
            return messageElements != null ? uu3.i(10, messageElements) + iH : iH;
        }

        @Override // defpackage.sia
        public CommentEdit mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                switch (iS) {
                    case 0:
                        break;
                    case 8:
                        this.requestId = su3Var.q();
                        break;
                    case 16:
                        this.parentChatServerId = su3Var.q();
                        break;
                    case 24:
                        this.parentMessageServerId = su3Var.q();
                        break;
                    case 32:
                        this.commentId = su3Var.q();
                        break;
                    case 42:
                        this.text = su3Var.r();
                        break;
                    case 48:
                        this.isTextNull = su3Var.f();
                        break;
                    case 58:
                        this.oldText = su3Var.r();
                        break;
                    case 64:
                        this.isOldTextNull = su3Var.f();
                        break;
                    case 72:
                        this.oldStatus = su3Var.p();
                        break;
                    case 82:
                        if (this.oldElements == null) {
                            this.oldElements = new Protos.MessageElements();
                        }
                        su3Var.j(this.oldElements);
                        break;
                    default:
                        if (!su3Var.u(iS)) {
                        }
                        break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.parentChatServerId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            long j3 = this.parentMessageServerId;
            if (j3 != 0) {
                uu3Var.x(3, j3);
            }
            long j4 = this.commentId;
            if (j4 != 0) {
                uu3Var.x(4, j4);
            }
            if (!this.text.equals("")) {
                uu3Var.E(5, this.text);
            }
            boolean z = this.isTextNull;
            if (z) {
                uu3Var.r(6, z);
            }
            if (!this.oldText.equals("")) {
                uu3Var.E(7, this.oldText);
            }
            boolean z2 = this.isOldTextNull;
            if (z2) {
                uu3Var.r(8, z2);
            }
            int i = this.oldStatus;
            if (i != 0) {
                uu3Var.w(9, i);
            }
            Protos.MessageElements messageElements = this.oldElements;
            if (messageElements != null) {
                uu3Var.y(10, messageElements);
            }
        }

        public static CommentEdit parseFrom(su3 su3Var) throws IOException {
            return new CommentEdit().mergeFrom(su3Var);
        }
    }

    public static final class CommentSend extends sia {
        private static volatile CommentSend[] _emptyArray;
        public long commentId;
        public long parentChatServerId;
        public long parentMessageServerId;
        public long requestId;
        public String traceId;

        public CommentSend() {
            clear();
        }

        public static CommentSend[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new CommentSend[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static CommentSend parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (CommentSend) sia.mergeFrom(new CommentSend(), bArr);
        }

        public CommentSend clear() {
            this.requestId = 0L;
            this.commentId = 0L;
            this.parentChatServerId = 0L;
            this.parentMessageServerId = 0L;
            this.traceId = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.commentId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            long j3 = this.parentChatServerId;
            if (j3 != 0) {
                iH += uu3.h(3, j3);
            }
            long j4 = this.parentMessageServerId;
            if (j4 != 0) {
                iH += uu3.h(4, j4);
            }
            return !this.traceId.equals("") ? uu3.l(5, this.traceId) + iH : iH;
        }

        @Override // defpackage.sia
        public CommentSend mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    this.commentId = su3Var.q();
                } else if (iS == 24) {
                    this.parentChatServerId = su3Var.q();
                } else if (iS == 32) {
                    this.parentMessageServerId = su3Var.q();
                } else if (iS == 42) {
                    this.traceId = su3Var.r();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.commentId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            long j3 = this.parentChatServerId;
            if (j3 != 0) {
                uu3Var.x(3, j3);
            }
            long j4 = this.parentMessageServerId;
            if (j4 != 0) {
                uu3Var.x(4, j4);
            }
            if (this.traceId.equals("")) {
                return;
            }
            uu3Var.E(5, this.traceId);
        }

        public static CommentSend parseFrom(su3 su3Var) throws IOException {
            return new CommentSend().mergeFrom(su3Var);
        }
    }

    public static final class Complain extends sia {
        private static volatile Complain[] _emptyArray;
        public String details;
        public long[] ids;
        public long parentId;
        public long postServerId;
        public int reasonId;
        public long requestId;
        public long[] serverIds;
        public int typeId;

        public Complain() {
            clear();
        }

        public static Complain[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Complain[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static Complain parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Complain) sia.mergeFrom(new Complain(), bArr);
        }

        public Complain clear() {
            this.requestId = 0L;
            this.typeId = 0;
            this.reasonId = 0;
            long[] jArr = sb8.f;
            this.ids = jArr;
            this.serverIds = jArr;
            this.parentId = 0L;
            this.details = "";
            this.postServerId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long[] jArr;
            long[] jArr2;
            long j = this.requestId;
            int i = 0;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            int i2 = this.typeId;
            if (i2 != 0) {
                iH += uu3.f(2, i2);
            }
            int i3 = this.reasonId;
            if (i3 != 0) {
                iH += uu3.f(3, i3);
            }
            long[] jArr3 = this.ids;
            if (jArr3 != null && jArr3.length > 0) {
                int i4 = 0;
                int iK = 0;
                while (true) {
                    jArr2 = this.ids;
                    if (i4 >= jArr2.length) {
                        break;
                    }
                    iK += uu3.k(jArr2[i4]);
                    i4++;
                }
                iH = iH + iK + jArr2.length;
            }
            long[] jArr4 = this.serverIds;
            if (jArr4 != null && jArr4.length > 0) {
                int iK2 = 0;
                while (true) {
                    jArr = this.serverIds;
                    if (i >= jArr.length) {
                        break;
                    }
                    iK2 += uu3.k(jArr[i]);
                    i++;
                }
                iH = iH + iK2 + jArr.length;
            }
            long j2 = this.parentId;
            if (j2 != 0) {
                iH += uu3.h(6, j2);
            }
            if (!this.details.equals("")) {
                iH += uu3.l(7, this.details);
            }
            long j3 = this.postServerId;
            return j3 != 0 ? uu3.h(8, j3) + iH : iH;
        }

        @Override // defpackage.sia
        public Complain mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                switch (iS) {
                    case 0:
                        break;
                    case 8:
                        this.requestId = su3Var.q();
                        break;
                    case 16:
                        this.typeId = su3Var.p();
                        break;
                    case 24:
                        this.reasonId = su3Var.p();
                        break;
                    case 32:
                        int I = sb8.I(su3Var, 32);
                        long[] jArr = this.ids;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = I + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = su3Var.q();
                            su3Var.s();
                            length++;
                        }
                        jArr2[length] = su3Var.q();
                        this.ids = jArr2;
                        break;
                    case 34:
                        int iE = su3Var.e(su3Var.p());
                        int iC = su3Var.c();
                        int i2 = 0;
                        while (su3Var.b() > 0) {
                            su3Var.q();
                            i2++;
                        }
                        su3Var.t(iC);
                        long[] jArr3 = this.ids;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = su3Var.q();
                            length2++;
                        }
                        this.ids = jArr4;
                        su3Var.d(iE);
                        break;
                    case 40:
                        int I2 = sb8.I(su3Var, 40);
                        long[] jArr5 = this.serverIds;
                        int length3 = jArr5 == null ? 0 : jArr5.length;
                        int i4 = I2 + length3;
                        long[] jArr6 = new long[i4];
                        if (length3 != 0) {
                            System.arraycopy(jArr5, 0, jArr6, 0, length3);
                        }
                        while (length3 < i4 - 1) {
                            jArr6[length3] = su3Var.q();
                            su3Var.s();
                            length3++;
                        }
                        jArr6[length3] = su3Var.q();
                        this.serverIds = jArr6;
                        break;
                    case 42:
                        int iE2 = su3Var.e(su3Var.p());
                        int iC2 = su3Var.c();
                        int i5 = 0;
                        while (su3Var.b() > 0) {
                            su3Var.q();
                            i5++;
                        }
                        su3Var.t(iC2);
                        long[] jArr7 = this.serverIds;
                        int length4 = jArr7 == null ? 0 : jArr7.length;
                        int i6 = i5 + length4;
                        long[] jArr8 = new long[i6];
                        if (length4 != 0) {
                            System.arraycopy(jArr7, 0, jArr8, 0, length4);
                        }
                        while (length4 < i6) {
                            jArr8[length4] = su3Var.q();
                            length4++;
                        }
                        this.serverIds = jArr8;
                        su3Var.d(iE2);
                        break;
                    case 48:
                        this.parentId = su3Var.q();
                        break;
                    case 58:
                        this.details = su3Var.r();
                        break;
                    case 64:
                        this.postServerId = su3Var.q();
                        break;
                    default:
                        if (!su3Var.u(iS)) {
                        }
                        break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            int i = this.typeId;
            if (i != 0) {
                uu3Var.w(2, i);
            }
            int i2 = this.reasonId;
            if (i2 != 0) {
                uu3Var.w(3, i2);
            }
            long[] jArr = this.ids;
            int i3 = 0;
            if (jArr != null && jArr.length > 0) {
                int i4 = 0;
                while (true) {
                    long[] jArr2 = this.ids;
                    if (i4 >= jArr2.length) {
                        break;
                    }
                    uu3Var.x(4, jArr2[i4]);
                    i4++;
                }
            }
            long[] jArr3 = this.serverIds;
            if (jArr3 != null && jArr3.length > 0) {
                while (true) {
                    long[] jArr4 = this.serverIds;
                    if (i3 >= jArr4.length) {
                        break;
                    }
                    uu3Var.x(5, jArr4[i3]);
                    i3++;
                }
            }
            long j2 = this.parentId;
            if (j2 != 0) {
                uu3Var.x(6, j2);
            }
            if (!this.details.equals("")) {
                uu3Var.E(7, this.details);
            }
            long j3 = this.postServerId;
            if (j3 != 0) {
                uu3Var.x(8, j3);
            }
        }

        public static Complain parseFrom(su3 su3Var) throws IOException {
            return new Complain().mergeFrom(su3Var);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Config extends sia {
        private static volatile Config[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public boolean isPushToken;
        public boolean isUserSettings;
        public long requestId;
        public boolean reset;
        public long[] syncChatIds;
        public Map<String, String> userSettings;

        public Config() {
            clear();
        }

        public static Config[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Config[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static Config parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Config) sia.mergeFrom(new Config(), bArr);
        }

        public Config clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.isPushToken = false;
            this.isUserSettings = false;
            this.userSettings = null;
            this.reset = false;
            this.syncChatIds = sb8.f;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int i = 0;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                iH += uu3.h(3, j3);
            }
            if (this.isPushToken) {
                iH += uu3.a(4);
            }
            if (this.isUserSettings) {
                iH += uu3.a(5);
            }
            Map<String, String> map = this.userSettings;
            if (map != null) {
                iH += ck8.a(map, 6, 9, 9);
            }
            if (this.reset) {
                iH += uu3.a(7);
            }
            long[] jArr = this.syncChatIds;
            if (jArr == null || jArr.length <= 0) {
                return iH;
            }
            int iK = 0;
            while (true) {
                long[] jArr2 = this.syncChatIds;
                if (i >= jArr2.length) {
                    return iH + iK + jArr2.length;
                }
                iK += uu3.k(jArr2[i]);
                i++;
            }
        }

        @Override // defpackage.sia
        public Config mergeFrom(su3 su3Var) throws IOException {
            su3 su3Var2;
            em9 em9Var = cqk.c;
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    su3Var2 = su3Var;
                    this.requestId = su3Var2.q();
                } else if (iS == 16) {
                    su3Var2 = su3Var;
                    this.chatId = su3Var2.q();
                } else if (iS == 24) {
                    su3Var2 = su3Var;
                    this.chatServerId = su3Var2.q();
                } else if (iS == 32) {
                    su3Var2 = su3Var;
                    this.isPushToken = su3Var2.f();
                } else if (iS == 40) {
                    su3Var2 = su3Var;
                    this.isUserSettings = su3Var2.f();
                } else if (iS != 50) {
                    if (iS == 56) {
                        this.reset = su3Var.f();
                    } else if (iS == 64) {
                        int I = sb8.I(su3Var, 64);
                        long[] jArr = this.syncChatIds;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = I + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = su3Var.q();
                            su3Var.s();
                            length++;
                        }
                        jArr2[length] = su3Var.q();
                        this.syncChatIds = jArr2;
                    } else if (iS == 66) {
                        int iE = su3Var.e(su3Var.p());
                        int iC = su3Var.c();
                        int i2 = 0;
                        while (su3Var.b() > 0) {
                            su3Var.q();
                            i2++;
                        }
                        su3Var.t(iC);
                        long[] jArr3 = this.syncChatIds;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = su3Var.q();
                            length2++;
                        }
                        this.syncChatIds = jArr4;
                        su3Var.d(iE);
                    } else if (!su3Var.u(iS)) {
                        break;
                    }
                    su3Var2 = su3Var;
                } else {
                    su3Var2 = su3Var;
                    this.userSettings = ck8.b(su3Var2, this.userSettings, em9Var, 9, 9, null, 10, 18);
                }
                su3Var = su3Var2;
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                uu3Var.x(3, j3);
            }
            boolean z = this.isPushToken;
            if (z) {
                uu3Var.r(4, z);
            }
            boolean z2 = this.isUserSettings;
            if (z2) {
                uu3Var.r(5, z2);
            }
            Map<String, String> map = this.userSettings;
            if (map != null) {
                ck8.d(uu3Var, map, 6, 9, 9);
            }
            boolean z3 = this.reset;
            if (z3) {
                uu3Var.r(7, z3);
            }
            long[] jArr = this.syncChatIds;
            if (jArr == null || jArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                long[] jArr2 = this.syncChatIds;
                if (i >= jArr2.length) {
                    return;
                }
                uu3Var.x(8, jArr2[i]);
                i++;
            }
        }

        public static Config parseFrom(su3 su3Var) throws IOException {
            return new Config().mergeFrom(su3Var);
        }
    }

    public static final class ContactUpdate extends sia {
        private static volatile ContactUpdate[] _emptyArray;
        public String action;
        public long contactId;
        public String lastName;
        public String newName;
        public String oldLastName;
        public String oldName;
        public long requestId;

        public ContactUpdate() {
            clear();
        }

        public static ContactUpdate[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ContactUpdate[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ContactUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ContactUpdate) sia.mergeFrom(new ContactUpdate(), bArr);
        }

        public ContactUpdate clear() {
            this.requestId = 0L;
            this.contactId = 0L;
            this.action = "";
            this.oldName = "";
            this.newName = "";
            this.lastName = "";
            this.oldLastName = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.contactId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            if (!this.action.equals("")) {
                iH += uu3.l(3, this.action);
            }
            if (!this.oldName.equals("")) {
                iH += uu3.l(4, this.oldName);
            }
            if (!this.newName.equals("")) {
                iH += uu3.l(5, this.newName);
            }
            if (!this.lastName.equals("")) {
                iH += uu3.l(6, this.lastName);
            }
            return !this.oldLastName.equals("") ? uu3.l(7, this.oldLastName) + iH : iH;
        }

        @Override // defpackage.sia
        public ContactUpdate mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    this.contactId = su3Var.q();
                } else if (iS == 26) {
                    this.action = su3Var.r();
                } else if (iS == 34) {
                    this.oldName = su3Var.r();
                } else if (iS == 42) {
                    this.newName = su3Var.r();
                } else if (iS == 50) {
                    this.lastName = su3Var.r();
                } else if (iS == 58) {
                    this.oldLastName = su3Var.r();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.contactId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            if (!this.action.equals("")) {
                uu3Var.E(3, this.action);
            }
            if (!this.oldName.equals("")) {
                uu3Var.E(4, this.oldName);
            }
            if (!this.newName.equals("")) {
                uu3Var.E(5, this.newName);
            }
            if (!this.lastName.equals("")) {
                uu3Var.E(6, this.lastName);
            }
            if (this.oldLastName.equals("")) {
                return;
            }
            uu3Var.E(7, this.oldLastName);
        }

        public static ContactUpdate parseFrom(su3 su3Var) throws IOException {
            return new ContactUpdate().mergeFrom(su3Var);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class CritLog extends sia {
        private static volatile CritLog[] _emptyArray;
        public String event;
        public byte[] params;
        public long requestId;
        public long sessionId;
        public long time;
        public String type;
        public long userId;

        public CritLog() {
            clear();
        }

        public static CritLog[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new CritLog[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static CritLog parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (CritLog) sia.mergeFrom(new CritLog(), bArr);
        }

        public CritLog clear() {
            this.requestId = 0L;
            this.time = 0L;
            this.userId = 0L;
            this.sessionId = 0L;
            this.type = "";
            this.event = "";
            this.params = sb8.i;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.time;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            long j3 = this.userId;
            if (j3 != 0) {
                iH += uu3.h(3, j3);
            }
            long j4 = this.sessionId;
            if (j4 != 0) {
                iH += uu3.h(4, j4);
            }
            if (!this.type.equals("")) {
                iH += uu3.l(5, this.type);
            }
            if (!this.event.equals("")) {
                iH += uu3.l(6, this.event);
            }
            return !Arrays.equals(this.params, sb8.i) ? uu3.b(7, this.params) + iH : iH;
        }

        @Override // defpackage.sia
        public CritLog mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    this.time = su3Var.q();
                } else if (iS == 24) {
                    this.userId = su3Var.q();
                } else if (iS == 32) {
                    this.sessionId = su3Var.q();
                } else if (iS == 42) {
                    this.type = su3Var.r();
                } else if (iS == 50) {
                    this.event = su3Var.r();
                } else if (iS == 58) {
                    this.params = su3Var.g();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.time;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            long j3 = this.userId;
            if (j3 != 0) {
                uu3Var.x(3, j3);
            }
            long j4 = this.sessionId;
            if (j4 != 0) {
                uu3Var.x(4, j4);
            }
            if (!this.type.equals("")) {
                uu3Var.E(5, this.type);
            }
            if (!this.event.equals("")) {
                uu3Var.E(6, this.event);
            }
            if (Arrays.equals(this.params, sb8.i)) {
                return;
            }
            uu3Var.s(7, this.params);
        }

        public static CritLog parseFrom(su3 su3Var) throws IOException {
            return new CritLog().mergeFrom(su3Var);
        }
    }

    public static final class DeleteChatsBatch extends sia {
        private static volatile DeleteChatsBatch[] _emptyArray;
        public long[] chatIds;
        public long lastFailTime;
        public long taskId;

        public DeleteChatsBatch() {
            clear();
        }

        public static DeleteChatsBatch[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new DeleteChatsBatch[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static DeleteChatsBatch parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (DeleteChatsBatch) sia.mergeFrom(new DeleteChatsBatch(), bArr);
        }

        public DeleteChatsBatch clear() {
            this.taskId = 0L;
            this.chatIds = sb8.f;
            this.lastFailTime = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long[] jArr;
            long j = this.taskId;
            int i = 0;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long[] jArr2 = this.chatIds;
            if (jArr2 != null && jArr2.length > 0) {
                int iK = 0;
                while (true) {
                    jArr = this.chatIds;
                    if (i >= jArr.length) {
                        break;
                    }
                    iK += uu3.k(jArr[i]);
                    i++;
                }
                iH = iH + iK + jArr.length;
            }
            long j2 = this.lastFailTime;
            return j2 != 0 ? uu3.h(3, j2) + iH : iH;
        }

        @Override // defpackage.sia
        public DeleteChatsBatch mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.taskId = su3Var.q();
                } else if (iS == 16) {
                    int I = sb8.I(su3Var, 16);
                    long[] jArr = this.chatIds;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = I + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = su3Var.q();
                        su3Var.s();
                        length++;
                    }
                    jArr2[length] = su3Var.q();
                    this.chatIds = jArr2;
                } else if (iS == 18) {
                    int iE = su3Var.e(su3Var.p());
                    int iC = su3Var.c();
                    int i2 = 0;
                    while (su3Var.b() > 0) {
                        su3Var.q();
                        i2++;
                    }
                    su3Var.t(iC);
                    long[] jArr3 = this.chatIds;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = su3Var.q();
                        length2++;
                    }
                    this.chatIds = jArr4;
                    su3Var.d(iE);
                } else if (iS == 24) {
                    this.lastFailTime = su3Var.q();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.taskId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long[] jArr = this.chatIds;
            if (jArr != null && jArr.length > 0) {
                int i = 0;
                while (true) {
                    long[] jArr2 = this.chatIds;
                    if (i >= jArr2.length) {
                        break;
                    }
                    uu3Var.x(2, jArr2[i]);
                    i++;
                }
            }
            long j2 = this.lastFailTime;
            if (j2 != 0) {
                uu3Var.x(3, j2);
            }
        }

        public static DeleteChatsBatch parseFrom(su3 su3Var) throws IOException {
            return new DeleteChatsBatch().mergeFrom(su3Var);
        }
    }

    public static final class FileDownloadCmd extends sia {
        private static volatile FileDownloadCmd[] _emptyArray;
        public String attachLocalId;
        public long chatId;
        public long fileId;
        public String fileName;
        public long messageId;
        public long requestId;

        public FileDownloadCmd() {
            clear();
        }

        public static FileDownloadCmd[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new FileDownloadCmd[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static FileDownloadCmd parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (FileDownloadCmd) sia.mergeFrom(new FileDownloadCmd(), bArr);
        }

        public FileDownloadCmd clear() {
            this.requestId = 0L;
            this.fileId = 0L;
            this.fileName = "";
            this.messageId = 0L;
            this.attachLocalId = "";
            this.chatId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.fileId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            if (!this.fileName.equals("")) {
                iH += uu3.l(3, this.fileName);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                iH += uu3.h(4, j3);
            }
            if (!this.attachLocalId.equals("")) {
                iH += uu3.l(5, this.attachLocalId);
            }
            long j4 = this.chatId;
            return j4 != 0 ? uu3.h(6, j4) + iH : iH;
        }

        @Override // defpackage.sia
        public FileDownloadCmd mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    this.fileId = su3Var.q();
                } else if (iS == 26) {
                    this.fileName = su3Var.r();
                } else if (iS == 32) {
                    this.messageId = su3Var.q();
                } else if (iS == 42) {
                    this.attachLocalId = su3Var.r();
                } else if (iS == 48) {
                    this.chatId = su3Var.q();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.fileId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            if (!this.fileName.equals("")) {
                uu3Var.E(3, this.fileName);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                uu3Var.x(4, j3);
            }
            if (!this.attachLocalId.equals("")) {
                uu3Var.E(5, this.attachLocalId);
            }
            long j4 = this.chatId;
            if (j4 != 0) {
                uu3Var.x(6, j4);
            }
        }

        public static FileDownloadCmd parseFrom(su3 su3Var) throws IOException {
            return new FileDownloadCmd().mergeFrom(su3Var);
        }
    }

    public static final class LocationRequest extends sia {
        private static volatile LocationRequest[] _emptyArray;
        public boolean liveLocation;
        public long messageId;
        public long requestId;

        public LocationRequest() {
            clear();
        }

        public static LocationRequest[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new LocationRequest[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static LocationRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (LocationRequest) sia.mergeFrom(new LocationRequest(), bArr);
        }

        public LocationRequest clear() {
            this.requestId = 0L;
            this.messageId = 0L;
            this.liveLocation = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.messageId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            return this.liveLocation ? uu3.a(3) + iH : iH;
        }

        @Override // defpackage.sia
        public LocationRequest mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    this.messageId = su3Var.q();
                } else if (iS == 24) {
                    this.liveLocation = su3Var.f();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            boolean z = this.liveLocation;
            if (z) {
                uu3Var.r(3, z);
            }
        }

        public static LocationRequest parseFrom(su3 su3Var) throws IOException {
            return new LocationRequest().mergeFrom(su3Var);
        }
    }

    public static final class LocationStop extends sia {
        private static volatile LocationStop[] _emptyArray;
        public long chatId;
        public long messageId;
        public long requestId;

        public LocationStop() {
            clear();
        }

        public static LocationStop[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new LocationStop[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static LocationStop parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (LocationStop) sia.mergeFrom(new LocationStop(), bArr);
        }

        public LocationStop clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.messageId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            long j3 = this.messageId;
            return j3 != 0 ? uu3.h(3, j3) + iH : iH;
        }

        @Override // defpackage.sia
        public LocationStop mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    this.chatId = su3Var.q();
                } else if (iS == 24) {
                    this.messageId = su3Var.q();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                uu3Var.x(3, j3);
            }
        }

        public static LocationStop parseFrom(su3 su3Var) throws IOException {
            return new LocationStop().mergeFrom(su3Var);
        }
    }

    public static final class MsgDelete extends sia {
        private static volatile MsgDelete[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public String complaint;
        public boolean forMe;
        public int itemTypeId;
        public long[] messagesId;
        public long[] messagesServerId;
        public boolean notDeleteMessageFromDb;
        public long requestId;

        public MsgDelete() {
            clear();
        }

        public static MsgDelete[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgDelete[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgDelete parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgDelete) sia.mergeFrom(new MsgDelete(), bArr);
        }

        public MsgDelete clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            long[] jArr = sb8.f;
            this.messagesId = jArr;
            this.messagesServerId = jArr;
            this.complaint = "";
            this.forMe = false;
            this.itemTypeId = 0;
            this.notDeleteMessageFromDb = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long[] jArr;
            long[] jArr2;
            long j = this.requestId;
            int i = 0;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                iH += uu3.h(3, j3);
            }
            long[] jArr3 = this.messagesId;
            if (jArr3 != null && jArr3.length > 0) {
                int i2 = 0;
                int iK = 0;
                while (true) {
                    jArr2 = this.messagesId;
                    if (i2 >= jArr2.length) {
                        break;
                    }
                    iK += uu3.k(jArr2[i2]);
                    i2++;
                }
                iH = iH + iK + jArr2.length;
            }
            long[] jArr4 = this.messagesServerId;
            if (jArr4 != null && jArr4.length > 0) {
                int iK2 = 0;
                while (true) {
                    jArr = this.messagesServerId;
                    if (i >= jArr.length) {
                        break;
                    }
                    iK2 += uu3.k(jArr[i]);
                    i++;
                }
                iH = iH + iK2 + jArr.length;
            }
            if (!this.complaint.equals("")) {
                iH += uu3.l(6, this.complaint);
            }
            if (this.forMe) {
                iH += uu3.a(7);
            }
            int i3 = this.itemTypeId;
            if (i3 != 0) {
                iH += uu3.f(8, i3);
            }
            return this.notDeleteMessageFromDb ? uu3.a(9) + iH : iH;
        }

        @Override // defpackage.sia
        public MsgDelete mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                switch (iS) {
                    case 0:
                        break;
                    case 8:
                        this.requestId = su3Var.q();
                        break;
                    case 16:
                        this.chatId = su3Var.q();
                        break;
                    case 24:
                        this.chatServerId = su3Var.q();
                        break;
                    case 32:
                        int I = sb8.I(su3Var, 32);
                        long[] jArr = this.messagesId;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = I + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = su3Var.q();
                            su3Var.s();
                            length++;
                        }
                        jArr2[length] = su3Var.q();
                        this.messagesId = jArr2;
                        break;
                    case 34:
                        int iE = su3Var.e(su3Var.p());
                        int iC = su3Var.c();
                        int i2 = 0;
                        while (su3Var.b() > 0) {
                            su3Var.q();
                            i2++;
                        }
                        su3Var.t(iC);
                        long[] jArr3 = this.messagesId;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = su3Var.q();
                            length2++;
                        }
                        this.messagesId = jArr4;
                        su3Var.d(iE);
                        break;
                    case 40:
                        int I2 = sb8.I(su3Var, 40);
                        long[] jArr5 = this.messagesServerId;
                        int length3 = jArr5 == null ? 0 : jArr5.length;
                        int i4 = I2 + length3;
                        long[] jArr6 = new long[i4];
                        if (length3 != 0) {
                            System.arraycopy(jArr5, 0, jArr6, 0, length3);
                        }
                        while (length3 < i4 - 1) {
                            jArr6[length3] = su3Var.q();
                            su3Var.s();
                            length3++;
                        }
                        jArr6[length3] = su3Var.q();
                        this.messagesServerId = jArr6;
                        break;
                    case 42:
                        int iE2 = su3Var.e(su3Var.p());
                        int iC2 = su3Var.c();
                        int i5 = 0;
                        while (su3Var.b() > 0) {
                            su3Var.q();
                            i5++;
                        }
                        su3Var.t(iC2);
                        long[] jArr7 = this.messagesServerId;
                        int length4 = jArr7 == null ? 0 : jArr7.length;
                        int i6 = i5 + length4;
                        long[] jArr8 = new long[i6];
                        if (length4 != 0) {
                            System.arraycopy(jArr7, 0, jArr8, 0, length4);
                        }
                        while (length4 < i6) {
                            jArr8[length4] = su3Var.q();
                            length4++;
                        }
                        this.messagesServerId = jArr8;
                        su3Var.d(iE2);
                        break;
                    case 50:
                        this.complaint = su3Var.r();
                        break;
                    case 56:
                        this.forMe = su3Var.f();
                        break;
                    case 64:
                        this.itemTypeId = su3Var.p();
                        break;
                    case 72:
                        this.notDeleteMessageFromDb = su3Var.f();
                        break;
                    default:
                        if (!su3Var.u(iS)) {
                        }
                        break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                uu3Var.x(3, j3);
            }
            long[] jArr = this.messagesId;
            int i = 0;
            if (jArr != null && jArr.length > 0) {
                int i2 = 0;
                while (true) {
                    long[] jArr2 = this.messagesId;
                    if (i2 >= jArr2.length) {
                        break;
                    }
                    uu3Var.x(4, jArr2[i2]);
                    i2++;
                }
            }
            long[] jArr3 = this.messagesServerId;
            if (jArr3 != null && jArr3.length > 0) {
                while (true) {
                    long[] jArr4 = this.messagesServerId;
                    if (i >= jArr4.length) {
                        break;
                    }
                    uu3Var.x(5, jArr4[i]);
                    i++;
                }
            }
            if (!this.complaint.equals("")) {
                uu3Var.E(6, this.complaint);
            }
            boolean z = this.forMe;
            if (z) {
                uu3Var.r(7, z);
            }
            int i3 = this.itemTypeId;
            if (i3 != 0) {
                uu3Var.w(8, i3);
            }
            boolean z2 = this.notDeleteMessageFromDb;
            if (z2) {
                uu3Var.r(9, z2);
            }
        }

        public static MsgDelete parseFrom(su3 su3Var) throws IOException {
            return new MsgDelete().mergeFrom(su3Var);
        }
    }

    public static final class MsgDeleteRange extends sia {
        private static volatile MsgDeleteRange[] _emptyArray;
        public long chatId;
        public long endTime;
        public int itemTypeId;
        public long requestId;
        public long startTime;

        public MsgDeleteRange() {
            clear();
        }

        public static MsgDeleteRange[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgDeleteRange[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgDeleteRange parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgDeleteRange) sia.mergeFrom(new MsgDeleteRange(), bArr);
        }

        public MsgDeleteRange clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.startTime = 0L;
            this.endTime = 0L;
            this.itemTypeId = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            long j3 = this.startTime;
            if (j3 != 0) {
                iH += uu3.h(3, j3);
            }
            long j4 = this.endTime;
            if (j4 != 0) {
                iH += uu3.h(4, j4);
            }
            int i = this.itemTypeId;
            return i != 0 ? uu3.f(5, i) + iH : iH;
        }

        @Override // defpackage.sia
        public MsgDeleteRange mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    this.chatId = su3Var.q();
                } else if (iS == 24) {
                    this.startTime = su3Var.q();
                } else if (iS == 32) {
                    this.endTime = su3Var.q();
                } else if (iS == 40) {
                    this.itemTypeId = su3Var.p();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            long j3 = this.startTime;
            if (j3 != 0) {
                uu3Var.x(3, j3);
            }
            long j4 = this.endTime;
            if (j4 != 0) {
                uu3Var.x(4, j4);
            }
            int i = this.itemTypeId;
            if (i != 0) {
                uu3Var.w(5, i);
            }
        }

        public static MsgDeleteRange parseFrom(su3 su3Var) throws IOException {
            return new MsgDeleteRange().mergeFrom(su3Var);
        }
    }

    public static final class MsgEdit extends sia {
        private static volatile MsgEdit[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public boolean editAttaches;
        public long messageId;
        public long messageServerId;
        public Protos.Attaches oldAttaches;
        public Protos.MessageElements oldElements;
        public int oldStatus;
        public String oldText;
        public long requestId;
        public String text;

        public MsgEdit() {
            clear();
        }

        public static MsgEdit[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgEdit[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgEdit parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgEdit) sia.mergeFrom(new MsgEdit(), bArr);
        }

        public MsgEdit clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.messageId = 0L;
            this.chatServerId = 0L;
            this.messageServerId = 0L;
            this.text = "";
            this.oldText = "";
            this.oldStatus = 0;
            this.oldAttaches = null;
            this.editAttaches = false;
            this.oldElements = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                iH += uu3.h(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                iH += uu3.h(4, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                iH += uu3.h(5, j5);
            }
            if (!this.text.equals("")) {
                iH += uu3.l(6, this.text);
            }
            if (!this.oldText.equals("")) {
                iH += uu3.l(7, this.oldText);
            }
            int i = this.oldStatus;
            if (i != 0) {
                iH += uu3.f(8, i);
            }
            Protos.Attaches attaches = this.oldAttaches;
            if (attaches != null) {
                iH += uu3.i(9, attaches);
            }
            if (this.editAttaches) {
                iH += uu3.a(10);
            }
            Protos.MessageElements messageElements = this.oldElements;
            return messageElements != null ? uu3.i(11, messageElements) + iH : iH;
        }

        @Override // defpackage.sia
        public MsgEdit mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                switch (iS) {
                    case 0:
                        break;
                    case 8:
                        this.requestId = su3Var.q();
                        break;
                    case 16:
                        this.chatId = su3Var.q();
                        break;
                    case 24:
                        this.messageId = su3Var.q();
                        break;
                    case 32:
                        this.chatServerId = su3Var.q();
                        break;
                    case 40:
                        this.messageServerId = su3Var.q();
                        break;
                    case 50:
                        this.text = su3Var.r();
                        break;
                    case 58:
                        this.oldText = su3Var.r();
                        break;
                    case 64:
                        this.oldStatus = su3Var.p();
                        break;
                    case 74:
                        if (this.oldAttaches == null) {
                            this.oldAttaches = new Protos.Attaches();
                        }
                        su3Var.j(this.oldAttaches);
                        break;
                    case 80:
                        this.editAttaches = su3Var.f();
                        break;
                    case 90:
                        if (this.oldElements == null) {
                            this.oldElements = new Protos.MessageElements();
                        }
                        su3Var.j(this.oldElements);
                        break;
                    default:
                        if (!su3Var.u(iS)) {
                        }
                        break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                uu3Var.x(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                uu3Var.x(4, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                uu3Var.x(5, j5);
            }
            if (!this.text.equals("")) {
                uu3Var.E(6, this.text);
            }
            if (!this.oldText.equals("")) {
                uu3Var.E(7, this.oldText);
            }
            int i = this.oldStatus;
            if (i != 0) {
                uu3Var.w(8, i);
            }
            Protos.Attaches attaches = this.oldAttaches;
            if (attaches != null) {
                uu3Var.y(9, attaches);
            }
            boolean z = this.editAttaches;
            if (z) {
                uu3Var.r(10, z);
            }
            Protos.MessageElements messageElements = this.oldElements;
            if (messageElements != null) {
                uu3Var.y(11, messageElements);
            }
        }

        public static MsgEdit parseFrom(su3 su3Var) throws IOException {
            return new MsgEdit().mergeFrom(su3Var);
        }
    }

    public static final class MsgSend extends sia {
        private static volatile MsgSend[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public long messageId;
        public boolean notify;
        public long requestId;
        public String traceId;
        public long userId;

        public MsgSend() {
            clear();
        }

        public static MsgSend[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgSend[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgSend parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgSend) sia.mergeFrom(new MsgSend(), bArr);
        }

        public MsgSend clear() {
            this.requestId = 0L;
            this.messageId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.userId = 0L;
            this.notify = false;
            this.traceId = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.messageId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                iH += uu3.h(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                iH += uu3.h(4, j4);
            }
            long j5 = this.userId;
            if (j5 != 0) {
                iH += uu3.h(5, j5);
            }
            if (this.notify) {
                iH += uu3.a(6);
            }
            return !this.traceId.equals("") ? uu3.l(9, this.traceId) + iH : iH;
        }

        @Override // defpackage.sia
        public MsgSend mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    this.messageId = su3Var.q();
                } else if (iS == 24) {
                    this.chatId = su3Var.q();
                } else if (iS == 32) {
                    this.chatServerId = su3Var.q();
                } else if (iS == 40) {
                    this.userId = su3Var.q();
                } else if (iS == 48) {
                    this.notify = su3Var.f();
                } else if (iS == 74) {
                    this.traceId = su3Var.r();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                uu3Var.x(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                uu3Var.x(4, j4);
            }
            long j5 = this.userId;
            if (j5 != 0) {
                uu3Var.x(5, j5);
            }
            boolean z = this.notify;
            if (z) {
                uu3Var.r(6, z);
            }
            if (this.traceId.equals("")) {
                return;
            }
            uu3Var.E(9, this.traceId);
        }

        public static MsgSend parseFrom(su3 su3Var) throws IOException {
            return new MsgSend().mergeFrom(su3Var);
        }
    }

    public static final class MsgSharePreview extends sia {
        private static volatile MsgSharePreview[] _emptyArray;
        public long messageId;
        public long requestId;
        public String text;

        public MsgSharePreview() {
            clear();
        }

        public static MsgSharePreview[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgSharePreview[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgSharePreview parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgSharePreview) sia.mergeFrom(new MsgSharePreview(), bArr);
        }

        public MsgSharePreview clear() {
            this.requestId = 0L;
            this.text = "";
            this.messageId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            if (!this.text.equals("")) {
                iH += uu3.l(2, this.text);
            }
            long j2 = this.messageId;
            return j2 != 0 ? uu3.h(3, j2) + iH : iH;
        }

        @Override // defpackage.sia
        public MsgSharePreview mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 18) {
                    this.text = su3Var.r();
                } else if (iS == 24) {
                    this.messageId = su3Var.q();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            if (!this.text.equals("")) {
                uu3Var.E(2, this.text);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                uu3Var.x(3, j2);
            }
        }

        public static MsgSharePreview parseFrom(su3 su3Var) throws IOException {
            return new MsgSharePreview().mergeFrom(su3Var);
        }
    }

    public static final class Profile extends sia {
        private static volatile Profile[] _emptyArray;
        public String avatarType;
        public Rect crop;
        public String description;
        public String firstName;
        public String lastName;
        public String link;
        public long photoId;
        public String photoToken;
        public long requestId;

        public Profile() {
            clear();
        }

        public static Profile[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Profile[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static Profile parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Profile) sia.mergeFrom(new Profile(), bArr);
        }

        public Profile clear() {
            this.requestId = 0L;
            this.photoToken = "";
            this.crop = null;
            this.description = "";
            this.link = "";
            this.photoId = 0L;
            this.firstName = "";
            this.lastName = "";
            this.avatarType = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            if (!this.photoToken.equals("")) {
                iH += uu3.l(3, this.photoToken);
            }
            Rect rect = this.crop;
            if (rect != null) {
                iH += uu3.i(4, rect);
            }
            if (!this.description.equals("")) {
                iH += uu3.l(5, this.description);
            }
            if (!this.link.equals("")) {
                iH += uu3.l(6, this.link);
            }
            long j2 = this.photoId;
            if (j2 != 0) {
                iH += uu3.h(7, j2);
            }
            if (!this.firstName.equals("")) {
                iH += uu3.l(8, this.firstName);
            }
            if (!this.lastName.equals("")) {
                iH += uu3.l(9, this.lastName);
            }
            return !this.avatarType.equals("") ? uu3.l(10, this.avatarType) + iH : iH;
        }

        @Override // defpackage.sia
        public Profile mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 26) {
                    this.photoToken = su3Var.r();
                } else if (iS == 34) {
                    if (this.crop == null) {
                        this.crop = new Rect();
                    }
                    su3Var.j(this.crop);
                } else if (iS == 42) {
                    this.description = su3Var.r();
                } else if (iS == 50) {
                    this.link = su3Var.r();
                } else if (iS == 56) {
                    this.photoId = su3Var.q();
                } else if (iS == 66) {
                    this.firstName = su3Var.r();
                } else if (iS == 74) {
                    this.lastName = su3Var.r();
                } else if (iS == 82) {
                    this.avatarType = su3Var.r();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            if (!this.photoToken.equals("")) {
                uu3Var.E(3, this.photoToken);
            }
            Rect rect = this.crop;
            if (rect != null) {
                uu3Var.y(4, rect);
            }
            if (!this.description.equals("")) {
                uu3Var.E(5, this.description);
            }
            if (!this.link.equals("")) {
                uu3Var.E(6, this.link);
            }
            long j2 = this.photoId;
            if (j2 != 0) {
                uu3Var.x(7, j2);
            }
            if (!this.firstName.equals("")) {
                uu3Var.E(8, this.firstName);
            }
            if (!this.lastName.equals("")) {
                uu3Var.E(9, this.lastName);
            }
            if (this.avatarType.equals("")) {
                return;
            }
            uu3Var.E(10, this.avatarType);
        }

        public static Profile parseFrom(su3 su3Var) throws IOException {
            return new Profile().mergeFrom(su3Var);
        }
    }

    public static final class Rect extends sia {
        private static volatile Rect[] _emptyArray;
        public float bottom;
        public float left;
        public float right;
        public float top;

        public Rect() {
            clear();
        }

        public static Rect[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Rect[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static Rect parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Rect) sia.mergeFrom(new Rect(), bArr);
        }

        public Rect clear() {
            this.left = 0.0f;
            this.top = 0.0f;
            this.right = 0.0f;
            this.bottom = 0.0f;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            int iE = Float.floatToIntBits(this.left) != Float.floatToIntBits(0.0f) ? uu3.e(1) : 0;
            if (Float.floatToIntBits(this.top) != Float.floatToIntBits(0.0f)) {
                iE += uu3.e(2);
            }
            if (Float.floatToIntBits(this.right) != Float.floatToIntBits(0.0f)) {
                iE += uu3.e(3);
            }
            return Float.floatToIntBits(this.bottom) != Float.floatToIntBits(0.0f) ? uu3.e(4) + iE : iE;
        }

        @Override // defpackage.sia
        public Rect mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 13) {
                    this.left = su3Var.i();
                } else if (iS == 21) {
                    this.top = su3Var.i();
                } else if (iS == 29) {
                    this.right = su3Var.i();
                } else if (iS == 37) {
                    this.bottom = su3Var.i();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            if (Float.floatToIntBits(this.left) != Float.floatToIntBits(0.0f)) {
                uu3Var.v(1, this.left);
            }
            if (Float.floatToIntBits(this.top) != Float.floatToIntBits(0.0f)) {
                uu3Var.v(2, this.top);
            }
            if (Float.floatToIntBits(this.right) != Float.floatToIntBits(0.0f)) {
                uu3Var.v(3, this.right);
            }
            if (Float.floatToIntBits(this.bottom) != Float.floatToIntBits(0.0f)) {
                uu3Var.v(4, this.bottom);
            }
        }

        public static Rect parseFrom(su3 su3Var) throws IOException {
            return new Rect().mergeFrom(su3Var);
        }
    }

    public static final class RemoveContactPhoto extends sia {
        private static volatile RemoveContactPhoto[] _emptyArray;
        public long photoId;
        public long requestId;

        public RemoveContactPhoto() {
            clear();
        }

        public static RemoveContactPhoto[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new RemoveContactPhoto[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static RemoveContactPhoto parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (RemoveContactPhoto) sia.mergeFrom(new RemoveContactPhoto(), bArr);
        }

        public RemoveContactPhoto clear() {
            this.requestId = 0L;
            this.photoId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.photoId;
            return j2 != 0 ? uu3.h(2, j2) + iH : iH;
        }

        @Override // defpackage.sia
        public RemoveContactPhoto mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    this.photoId = su3Var.q();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.photoId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
        }

        public static RemoveContactPhoto parseFrom(su3 su3Var) throws IOException {
            return new RemoveContactPhoto().mergeFrom(su3Var);
        }
    }

    public static final class SuspendBot extends sia {
        private static volatile SuspendBot[] _emptyArray;
        public long botId;
        public long chatId;
        public long requestId;
        public boolean suspend;

        public SuspendBot() {
            clear();
        }

        public static SuspendBot[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new SuspendBot[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static SuspendBot parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SuspendBot) sia.mergeFrom(new SuspendBot(), bArr);
        }

        public SuspendBot clear() {
            this.requestId = 0L;
            this.botId = 0L;
            this.chatId = 0L;
            this.suspend = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.botId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                iH += uu3.h(3, j3);
            }
            return this.suspend ? uu3.a(4) + iH : iH;
        }

        @Override // defpackage.sia
        public SuspendBot mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    this.botId = su3Var.q();
                } else if (iS == 24) {
                    this.chatId = su3Var.q();
                } else if (iS == 32) {
                    this.suspend = su3Var.f();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.botId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                uu3Var.x(3, j3);
            }
            boolean z = this.suspend;
            if (z) {
                uu3Var.r(4, z);
            }
        }

        public static SuspendBot parseFrom(su3 su3Var) throws IOException {
            return new SuspendBot().mergeFrom(su3Var);
        }
    }

    public static final class SyncChatHistory extends sia {
        private static volatile SyncChatHistory[] _emptyArray;
        public long chatId;
        public int count;
        public int itemTypeId;
        public long taskId;

        public SyncChatHistory() {
            clear();
        }

        public static SyncChatHistory[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new SyncChatHistory[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static SyncChatHistory parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SyncChatHistory) sia.mergeFrom(new SyncChatHistory(), bArr);
        }

        public SyncChatHistory clear() {
            this.taskId = 0L;
            this.chatId = 0L;
            this.count = 0;
            this.itemTypeId = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.taskId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            int i = this.count;
            if (i != 0) {
                iH += uu3.f(3, i);
            }
            int i2 = this.itemTypeId;
            return i2 != 0 ? uu3.f(4, i2) + iH : iH;
        }

        @Override // defpackage.sia
        public SyncChatHistory mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.taskId = su3Var.q();
                } else if (iS == 16) {
                    this.chatId = su3Var.q();
                } else if (iS == 24) {
                    this.count = su3Var.p();
                } else if (iS == 32) {
                    this.itemTypeId = su3Var.p();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.taskId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            int i = this.count;
            if (i != 0) {
                uu3Var.w(3, i);
            }
            int i2 = this.itemTypeId;
            if (i2 != 0) {
                uu3Var.w(4, i2);
            }
        }

        public static SyncChatHistory parseFrom(su3 su3Var) throws IOException {
            return new SyncChatHistory().mergeFrom(su3Var);
        }
    }

    public static final class UpdateFireTimeProtoTask extends sia {
        private static volatile UpdateFireTimeProtoTask[] _emptyArray;
        public long chatId;
        public long fireTime;
        public long messageId;
        public boolean notifySender;
        public long requestId;

        public UpdateFireTimeProtoTask() {
            clear();
        }

        public static UpdateFireTimeProtoTask[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new UpdateFireTimeProtoTask[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static UpdateFireTimeProtoTask parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (UpdateFireTimeProtoTask) sia.mergeFrom(new UpdateFireTimeProtoTask(), bArr);
        }

        public UpdateFireTimeProtoTask clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.messageId = 0L;
            this.fireTime = 0L;
            this.notifySender = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                iH += uu3.h(3, j3);
            }
            long j4 = this.fireTime;
            if (j4 != 0) {
                iH += uu3.h(4, j4);
            }
            return this.notifySender ? uu3.a(5) + iH : iH;
        }

        @Override // defpackage.sia
        public UpdateFireTimeProtoTask mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = su3Var.q();
                } else if (iS == 16) {
                    this.chatId = su3Var.q();
                } else if (iS == 24) {
                    this.messageId = su3Var.q();
                } else if (iS == 32) {
                    this.fireTime = su3Var.q();
                } else if (iS == 40) {
                    this.notifySender = su3Var.f();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                uu3Var.x(3, j3);
            }
            long j4 = this.fireTime;
            if (j4 != 0) {
                uu3Var.x(4, j4);
            }
            boolean z = this.notifySender;
            if (z) {
                uu3Var.r(5, z);
            }
        }

        public static UpdateFireTimeProtoTask parseFrom(su3 su3Var) throws IOException {
            return new UpdateFireTimeProtoTask().mergeFrom(su3Var);
        }
    }

    public static final class VideoPlay extends sia {
        private static volatile VideoPlay[] _emptyArray;
        public String attachLocalId;
        public long chatServerId;
        public long messageId;
        public long messageServerId;
        public int place;
        public long requestId;
        public boolean saveToGallery;
        public boolean startDownload;
        public String token;
        public long videoId;

        public VideoPlay() {
            clear();
        }

        public static VideoPlay[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new VideoPlay[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static VideoPlay parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (VideoPlay) sia.mergeFrom(new VideoPlay(), bArr);
        }

        public VideoPlay clear() {
            this.requestId = 0L;
            this.videoId = 0L;
            this.messageId = 0L;
            this.attachLocalId = "";
            this.startDownload = false;
            this.chatServerId = 0L;
            this.messageServerId = 0L;
            this.token = "";
            this.saveToGallery = false;
            this.place = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long j2 = this.videoId;
            if (j2 != 0) {
                iH += uu3.h(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                iH += uu3.h(3, j3);
            }
            if (!this.attachLocalId.equals("")) {
                iH += uu3.l(4, this.attachLocalId);
            }
            if (this.startDownload) {
                iH += uu3.a(5);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                iH += uu3.h(6, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                iH += uu3.h(7, j5);
            }
            if (!this.token.equals("")) {
                iH += uu3.l(8, this.token);
            }
            if (this.saveToGallery) {
                iH += uu3.a(9);
            }
            int i = this.place;
            return i != 0 ? uu3.f(10, i) + iH : iH;
        }

        @Override // defpackage.sia
        public VideoPlay mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                switch (iS) {
                    case 0:
                        break;
                    case 8:
                        this.requestId = su3Var.q();
                        break;
                    case 16:
                        this.videoId = su3Var.q();
                        break;
                    case 24:
                        this.messageId = su3Var.q();
                        break;
                    case 34:
                        this.attachLocalId = su3Var.r();
                        break;
                    case 40:
                        this.startDownload = su3Var.f();
                        break;
                    case 48:
                        this.chatServerId = su3Var.q();
                        break;
                    case 56:
                        this.messageServerId = su3Var.q();
                        break;
                    case 66:
                        this.token = su3Var.r();
                        break;
                    case 72:
                        this.saveToGallery = su3Var.f();
                        break;
                    case 80:
                        this.place = su3Var.p();
                        break;
                    default:
                        if (!su3Var.u(iS)) {
                        }
                        break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long j2 = this.videoId;
            if (j2 != 0) {
                uu3Var.x(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                uu3Var.x(3, j3);
            }
            if (!this.attachLocalId.equals("")) {
                uu3Var.E(4, this.attachLocalId);
            }
            boolean z = this.startDownload;
            if (z) {
                uu3Var.r(5, z);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                uu3Var.x(6, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                uu3Var.x(7, j5);
            }
            if (!this.token.equals("")) {
                uu3Var.E(8, this.token);
            }
            boolean z2 = this.saveToGallery;
            if (z2) {
                uu3Var.r(9, z2);
            }
            int i = this.place;
            if (i != 0) {
                uu3Var.w(10, i);
            }
        }

        public static VideoPlay parseFrom(su3 su3Var) throws IOException {
            return new VideoPlay().mergeFrom(su3Var);
        }
    }

    public static final class WarmChatHistory extends sia {
        private static volatile WarmChatHistory[] _emptyArray;
        public long[] chatIds;
        public long lastFailTime;
        public long taskId;

        public WarmChatHistory() {
            clear();
        }

        public static WarmChatHistory[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new WarmChatHistory[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static WarmChatHistory parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (WarmChatHistory) sia.mergeFrom(new WarmChatHistory(), bArr);
        }

        public WarmChatHistory clear() {
            this.taskId = 0L;
            this.chatIds = sb8.f;
            this.lastFailTime = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long[] jArr;
            long j = this.taskId;
            int i = 0;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            long[] jArr2 = this.chatIds;
            if (jArr2 != null && jArr2.length > 0) {
                int iK = 0;
                while (true) {
                    jArr = this.chatIds;
                    if (i >= jArr.length) {
                        break;
                    }
                    iK += uu3.k(jArr[i]);
                    i++;
                }
                iH = iH + iK + jArr.length;
            }
            long j2 = this.lastFailTime;
            return j2 != 0 ? uu3.h(3, j2) + iH : iH;
        }

        @Override // defpackage.sia
        public WarmChatHistory mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.taskId = su3Var.q();
                } else if (iS == 16) {
                    int I = sb8.I(su3Var, 16);
                    long[] jArr = this.chatIds;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = I + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = su3Var.q();
                        su3Var.s();
                        length++;
                    }
                    jArr2[length] = su3Var.q();
                    this.chatIds = jArr2;
                } else if (iS == 18) {
                    int iE = su3Var.e(su3Var.p());
                    int iC = su3Var.c();
                    int i2 = 0;
                    while (su3Var.b() > 0) {
                        su3Var.q();
                        i2++;
                    }
                    su3Var.t(iC);
                    long[] jArr3 = this.chatIds;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = su3Var.q();
                        length2++;
                    }
                    this.chatIds = jArr4;
                    su3Var.d(iE);
                } else if (iS == 24) {
                    this.lastFailTime = su3Var.q();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.taskId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            long[] jArr = this.chatIds;
            if (jArr != null && jArr.length > 0) {
                int i = 0;
                while (true) {
                    long[] jArr2 = this.chatIds;
                    if (i >= jArr2.length) {
                        break;
                    }
                    uu3Var.x(2, jArr2[i]);
                    i++;
                }
            }
            long j2 = this.lastFailTime;
            if (j2 != 0) {
                uu3Var.x(3, j2);
            }
        }

        public static WarmChatHistory parseFrom(su3 su3Var) throws IOException {
            return new WarmChatHistory().mergeFrom(su3Var);
        }
    }
}
