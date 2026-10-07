package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Trace;
import android.view.View;
import androidx.fragment.app.c;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.session.MediaSessionService;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.MappedByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import one.me.folders.pickerfolders.FoldersPickerScreen;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;
import one.me.messages.settings.MessagesSettingsScreen;
import org.apache.http.conn.params.ConnManagerParams;
import org.webrtc.EglBase;
import org.webrtc.EglBase10Impl;
import org.webrtc.EglBase14Impl;
import org.webrtc.EglRenderer;
import org.webrtc.VideoFrame;
import ru.ok.android.externcalls.analytics.internal.upload.MultiUploadHelper;
import ru.ok.android.externcalls.sdk.ml.MLFeaturesManagerImpl;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k36 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k36(kg6 kg6Var, f4d f4dVar) {
        this.a = 6;
        this.b = f4dVar;
    }

    private final void a() {
        d77 d77Var = (d77) this.b;
        synchronized (d77Var.d) {
            try {
                if (d77Var.h == null) {
                    return;
                }
                try {
                    m77 m77VarC = d77Var.c();
                    int i = m77VarC.e;
                    if (i == 2) {
                        synchronized (d77Var.d) {
                        }
                    }
                    if (i != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                    }
                    try {
                        int i2 = mwh.a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        so2 so2Var = d77Var.c;
                        Context context = d77Var.a;
                        so2Var.getClass();
                        m77[] m77VarArr = {m77VarC};
                        f83 f83Var = h9i.a;
                        cqk.f("TypefaceCompat.createFromFontInfo");
                        try {
                            Typeface typefaceG = h9i.a.g(context, m77VarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer mappedByteBufferD = b0m.d(d77Var.a, m77VarC.a);
                            if (mappedByteBufferD == null || typefaceG == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                ljf ljfVar = new ljf(typefaceG, uuk.b(mappedByteBufferD));
                                Trace.endSection();
                                Trace.endSection();
                                synchronized (d77Var.d) {
                                    try {
                                        svl svlVar = d77Var.h;
                                        if (svlVar != null) {
                                            svlVar.c(ljfVar);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                d77Var.b();
                            } catch (Throwable th2) {
                                int i3 = mwh.a;
                                Trace.endSection();
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        int i4 = mwh.a;
                        Trace.endSection();
                        throw th4;
                    }
                } catch (Throwable th5) {
                    synchronized (d77Var.d) {
                        try {
                            svl svlVar2 = d77Var.h;
                            if (svlVar2 != null) {
                                svlVar2.b(th5);
                            }
                            d77Var.b();
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                }
            } catch (Throwable th7) {
                throw th7;
            }
        }
    }

    private final void b() {
        gxa gxaVar = (gxa) this.b;
        synchronized (gxaVar.c) {
            try {
                exa exaVar = gxaVar.f;
                if (exaVar != null) {
                    exaVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((EglBase10Impl.EglConnection) this.b).lambda$new$0();
                return;
            case 1:
                ((EglBase14Impl.EglConnection) this.b).lambda$new$0();
                return;
            case 2:
                ((EglRenderer) this.b).renderFrameOnRenderThread();
                return;
            case 3:
                ((EglBase.EglConnection) this.b).release();
                return;
            case 4:
                ((k86) this.b).a();
                return;
            case 5:
                l96.setRefreshingNext$lambda$0((l96) this.b);
                return;
            case 6:
                f4d f4dVar = (f4d) this.b;
                try {
                    synchronized (f4dVar) {
                    }
                    try {
                        f4dVar.a.a(f4dVar.c, f4dVar.d);
                        return;
                    } finally {
                        f4dVar.a(true);
                    }
                } catch (ExoPlaybackException e) {
                    lvb.l0("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    qr7.o(e);
                    return;
                }
            case 7:
                ((xg6) this.b).c();
                return;
            case 8:
                hj6 hj6Var = (hj6) this.b;
                ((o02) hj6Var.a).q(new fj6(hj6Var, 5), true);
                return;
            case 9:
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) this.b;
                zv8[] zv8VarArr = FakeInAppReviewBottomSheet.E;
                fakeInAppReviewBottomSheet.v1(true);
                return;
            case 10:
                wx6 wx6Var = (wx6) this.b;
                k96 k96Var = wx6Var.i;
                if (k96Var != null) {
                    k96Var.X();
                }
                k96 k96Var2 = wx6Var.i;
                if (k96Var2 != null) {
                    k96Var2.postInvalidate();
                    return;
                }
                return;
            case 11:
                FoldersPickerScreen foldersPickerScreen = (FoldersPickerScreen) this.b;
                zv8[] zv8VarArr2 = FoldersPickerScreen.l;
                if (foldersPickerScreen.getView() != null) {
                    ((RecyclerView) foldersPickerScreen.h.m(foldersPickerScreen, FoldersPickerScreen.l[2])).X();
                    return;
                }
                return;
            case 12:
                a();
                return;
            case 13:
                Iterator it = ((c) this.b).m.iterator();
                if (it.hasNext()) {
                    throw qt4.h(it);
                }
                return;
            case 14:
                ((i1m) this.b).a0();
                return;
            case 15:
                ((jy7) this.b).a.setVisibility(8);
                return;
            case 16:
                b58 b58Var = (b58) this.b;
                synchronized (b58Var.w) {
                    try {
                        b58Var.y = null;
                        l78 l78Var = b58Var.x;
                        if (l78Var != null) {
                            b58Var.x = null;
                            b58Var.e(l78Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 17:
                ((VideoFrame.I420Buffer) this.b).release();
                return;
            case 18:
                tw5 tw5Var = (tw5) this.b;
                if (((ri2) tw5Var.d) != null) {
                    tw5Var.y();
                    t09 t09Var = (t09) tw5Var.e;
                    Set<xh0> setKeySet = (HashSet) tw5Var.g;
                    synchronized (t09Var.a) {
                        if (setKeySet == null) {
                            try {
                                setKeySet = t09Var.b.keySet();
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        for (xh0 xh0Var : setKeySet) {
                            if (t09Var.b.containsKey(xh0Var)) {
                                t09Var.l((o09) t09Var.b.get(xh0Var));
                            }
                        }
                        break;
                    }
                    return;
                }
                return;
            case 19:
                qi9 qi9Var = (qi9) this.b;
                qi9Var.f().setBackground(null);
                View viewFindViewById = qi9Var.f().findViewById(R.id.oneme_longpress_playback_control_hint);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(8);
                    qi9Var.d().stop();
                    return;
                }
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                MLFeaturesManagerImpl.setNsParams$lambda$0((MLFeaturesManagerImpl) this.b);
                return;
            case 21:
                MediaKeyboardWidget mediaKeyboardWidget = (MediaKeyboardWidget) this.b;
                zv8[] zv8VarArr3 = MediaKeyboardWidget.u;
                mediaKeyboardWidget.p1();
                return;
            case 22:
                ((o3a) this.b).L();
                return;
            case 23:
                synchronized (((MediaSessionService) this.b).a) {
                    break;
                }
                return;
            case 24:
                dka.setLayout$lambda$0((dka) this.b);
                return;
            case 25:
                dka.setStartDrawable$lambda$0((AnimationDrawable) this.b);
                return;
            case 26:
                MessagesLayoutManager messagesLayoutManager = (MessagesLayoutManager) this.b;
                RecyclerView recyclerView = messagesLayoutManager.J;
                if (recyclerView != null && recyclerView.s && recyclerView.isInLayout()) {
                    messagesLayoutManager.w1();
                    return;
                }
                c9b c9bVar = messagesLayoutManager.M;
                Object[] objArr = c9bVar.b;
                long[] jArr = c9bVar.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ((gpa) objArr[(i << 3) + i3]).a();
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            return;
                        }
                    }
                    if (i == length) {
                        return;
                    } else {
                        i++;
                    }
                }
                break;
            case 27:
                View view = ((MessagesSettingsScreen) this.b).n;
                if (view != null) {
                    view.setClickable(true);
                    return;
                }
                return;
            case 28:
                b();
                return;
            default:
                ((MultiUploadHelper) this.b).scheduleNextUpload(true, 1);
                return;
        }
    }

    public /* synthetic */ k36(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
