package defpackage;

import android.content.Context;
import android.graphics.Color;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.concurrent.CopyOnWriteArrayList;
import one.video.player.BaseVideoPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class tvi extends AppCompatTextView {
    public String h;
    public boolean i;
    public final f4g j;
    public long k;
    public aec l;
    public final svi m;
    public final rvi n;

    public tvi(Context context) {
        super(context, null, 0);
        this.j = new f4g(19, this);
        this.k = 1000L;
        setTextSize(dri.a(2, 4.0f));
        setTextColor(-1);
        setBackgroundColor(Color.parseColor("#88000000"));
        int iA = (int) dri.a(1, 16.0f);
        setPadding(iA, iA, iA, iA);
        setFixedText("NO PLAYER");
        this.m = new svi(this);
        this.n = new rvi(this);
    }

    public final void setFixedText(String str) {
        this.i = true;
        setText(str);
    }

    public final String getExtraLogInfo() {
        return this.h;
    }

    public final aec getPlayer() {
        return this.l;
    }

    public final long getUpdatePeriodMillis() {
        return this.k;
    }

    public final void r() {
        long j = this.k;
        if (j <= 0 || this.i) {
            return;
        }
        postDelayed(this.j, j);
    }

    public final void s(aec aecVar) {
        if (this.i) {
            this.i = false;
            removeCallbacks(this.j);
            r();
        }
        t(aecVar);
    }

    public final void setExtraLogInfo(String str) {
        this.h = str;
    }

    public final void setPlayer(aec aecVar) {
        aec aecVar2 = this.l;
        if (cqk.d(aecVar, aecVar2)) {
            return;
        }
        this.l = aecVar;
        rvi rviVar = this.n;
        if (aecVar2 != null) {
            BaseVideoPlayer baseVideoPlayer = (BaseVideoPlayer) aecVar2;
            baseVideoPlayer.verifyThread("one.video.player.BaseVideoPlayer.removeListener");
            ga7 ga7Var = baseVideoPlayer.k;
            ga7Var.b.remove(rviVar);
            boolean z = nec.a;
            ga7Var.b.size();
        }
        svi sviVar = this.m;
        if (aecVar2 != null) {
            BaseVideoPlayer baseVideoPlayer2 = (BaseVideoPlayer) aecVar2;
            baseVideoPlayer2.verifyThread("one.video.player.BaseVideoPlayer.removePositionChangeListener");
            CopyOnWriteArrayList copyOnWriteArrayList = baseVideoPlayer2.l;
            copyOnWriteArrayList.remove(sviVar);
            boolean z2 = nec.a;
            copyOnWriteArrayList.size();
        }
        if (aecVar == null) {
            setFixedText("NO PLAYER");
            removeCallbacks(this.j);
            return;
        }
        BaseVideoPlayer baseVideoPlayer3 = (BaseVideoPlayer) aecVar;
        baseVideoPlayer3.g(rviVar);
        baseVideoPlayer3.verifyThread("one.video.player.BaseVideoPlayer.addPositionChangeListener");
        CopyOnWriteArrayList copyOnWriteArrayList2 = baseVideoPlayer3.l;
        copyOnWriteArrayList2.add(sviVar);
        boolean z3 = nec.a;
        copyOnWriteArrayList2.size();
        s(aecVar);
        r();
    }

    public final void setUpdatePeriodMillis(long j) {
        if (j != this.k) {
            removeCallbacks(this.j);
            if (j < 500) {
                j = j > 0 ? 500L : 0L;
            }
            this.k = j;
            r();
        }
    }

    public final void t(aec aecVar) {
        if (this.i) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(aecVar.a());
        String str = this.h;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                if (sb.length() > 0 && !r5h.O0("\n", sb)) {
                    sb.append("\n");
                }
                sb.append(str);
                sb.append('\n');
            }
        }
        setText(sb.toString());
    }
}
