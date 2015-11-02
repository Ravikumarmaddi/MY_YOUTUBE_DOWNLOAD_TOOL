package com.tools.youtube;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import com.github.axet.vget.VGet;
import com.github.axet.vget.info.VideoInfo;
import com.github.axet.vget.info.VideoInfoUser;
import com.github.axet.wget.info.DownloadInfo;
import com.github.axet.wget.info.DownloadInfo.Part;
import com.github.axet.wget.info.DownloadInfo.Part.States;

// TODO - YOUTUBE PLAYLIST DOWNLOAD
public class AppManagedDownload {
	public static void main(String[] args) throws InterruptedException {
		AppManagedDownload e = new AppManagedDownload();
		ArrayList<String> urls = new ArrayList<String>();
		// urls.add("");
		urls.add("https://www.youtube.com/watch?v=W12ahO0Y7dU");
		
		//urls.add("https://www.youtube.com/watch?v=WFBXhCYrqv4");
		//urls.add("https://www.youtube.com/watch?v=yth6cTI97sE");
		//urls.add("https://www.youtube.com/watch?v=1OT9nbFBP7g");
		/*urls.add("https://www.youtube.com/watch?v=N2XyNn5z5lk");
		urls.add("https://www.youtube.com/watch?v=8ZWCdaM1tAY");
		urls.add("https://www.youtube.com/watch?v=Jarg-7h8vy4");
		urls.add("https://www.youtube.com/watch?v=xy6qJopuyPw");
		urls.add("https://www.youtube.com/watch?v=9yzLcLQ9oNE");
		urls.add("https://www.youtube.com/watch?v=i4MkFAavRC8");
		urls.add("https://www.youtube.com/watch?v=YkEDVp3u0ls");
		urls.add("https://www.youtube.com/watch?v=1y5N2hXOKL4");
		urls.add("https://www.youtube.com/watch?v=qcPS5_80UIY");
		urls.add("https://www.youtube.com/watch?v=zQby2_qObS8");
		urls.add("https://www.youtube.com/watch?v=HpZnlTAxdEI");
		urls.add("https://www.youtube.com/watch?v=18ZT8IrN9qo");
		urls.add("https://www.youtube.com/watch?v=gAioeWL1xaU");
		urls.add("https://www.youtube.com/watch?v=v_6KuYtc0Z8");
		urls.add("https://www.youtube.com/watch?v=beojQTxwLNk");
		
		
		 urls.add("https://www.youtube.com/watch?v=CmtYPbwO8TM");
		 urls.add("https://www.youtube.com/watch?v=HP5QYR3m54E");
		 urls.add("https://www.youtube.com/watch?v=--Ko3NgwpWo");
		 urls.add("https://www.youtube.com/watch?v=bIOqfekUeMI");
		 urls.add("https://www.youtube.com/watch?v=KzwFm8JE3jY");
		 urls.add("https://www.youtube.com/watch?v=fpqkizFGIqU");
		 urls.add("https://www.youtube.com/watch?v=OUgjWJ8xzRc");
		 urls.add("https://www.youtube.com/watch?v=x59b1lPyyQc");
		 urls.add("https://www.youtube.com/watch?v=ngCPZNV_hMM");
		 urls.add("https://www.youtube.com/watch?v=LlHvOgJm1lY");
		 urls.add("https://www.youtube.com/watch?v=CbrNE3ghesE");
		 urls.add("https://www.youtube.com/watch?v=nVeI5ylnGTA");
		 urls.add("https://www.youtube.com/watch?v=Hlh7mWQs4J8");
		 urls.add("https://www.youtube.com/watch?v=4Irfi0-MoQ4");
		 urls.add("https://www.youtube.com/watch?v=8tPjHX1vlbM");
		 urls.add("https://www.youtube.com/watch?v=2sRnrjF--Qg");
		 urls.add("https://www.youtube.com/watch?v=FiCbzftwt48");
		 urls.add("https://www.youtube.com/watch?v=ZVy6Be17iuM");
		 urls.add("https://www.youtube.com/watch?v=Ihun5FXscAQ");
		 urls.add("https://www.youtube.com/watch?v=Q_TP-VaDA1Q");
		 urls.add("https://www.youtube.com/watch?v=HDQX39HBaF0");
		 urls.add("https://www.youtube.com/watch?v=-avlQ8lLZe4");
		 urls.add("https://www.youtube.com/watch?v=rMBQuIoOkEc");
		 urls.add("https://www.youtube.com/watch?v=80l3MF6J9cw");
		 urls.add("https://www.youtube.com/watch?v=vz8u3LGb4F0");
		 urls.add("https://www.youtube.com/watch?v=qAkWPrFJFTM");
		 urls.add("https://www.youtube.com/watch?v=JNzvAhlXLrg");
		 urls.add("https://www.youtube.com/watch?v=s_CDYjxHrwI");
		 urls.add("https://www.youtube.com/watch?v=L4IxnyUxJ7s");
		 urls.add("https://www.youtube.com/watch?v=N5-vn0B2R3c");
		 urls.add("https://www.youtube.com/watch?v=jm1iYI6iL80");
		 urls.add("https://www.youtube.com/watch?v=4LMCBFwD_tw");
		 urls.add("https://www.youtube.com/watch?v=Kx7WBAXCo44");
		 urls.add("https://www.youtube.com/watch?v=urIeH5yN5B4");
		 urls.add("https://www.youtube.com/watch?v=Z5C9BBTlOg8");
		 urls.add("https://www.youtube.com/watch?v=Mi0TgGBNQeM");
		 urls.add("https://www.youtube.com/watch?v=qAtQjj2yOug");
		 urls.add("https://www.youtube.com/watch?v=UlJli69NQzM");
		 urls.add("https://www.youtube.com/watch?v=1WAsw1qALzQ");
		 urls.add("https://www.youtube.com/watch?v=BTrDlUFRrZs");
		 urls.add("https://www.youtube.com/watch?v=cTBGG3VY71g");
		 urls.add("https://www.youtube.com/watch?v=oLdwSFVggMo");
		 urls.add("https://www.youtube.com/watch?v=fElT-_uBiO8");
		 urls.add("https://www.youtube.com/watch?v=x5GH3kxobms");
		 */e.startDownload(urls);
		System.out.println("DOWNLOAD COMPLETED");
	}

	public void startDownload(ArrayList<String> urls)
			throws InterruptedException {
		AppManagedDownload e = new AppManagedDownload();
		String path = "C:/YoutudeDownload";
		downloadedYoutube();
		for (current = 0; current < urls.size(); current++) {
			retryCount =0;
			if (urls.get(current) != null && !urls.get(current).equals("")) {
				if (!done.contains(urls.get(current))) {
					System.out.println("NEXT YOUTUBE DOWNLOADING \n"
							+ (current + 1) + " of " + urls.size() + "\n"
							+ urls.get(current));
					e.run(urls.get(current), new File(path));
					Thread.sleep(20000);
					System.out.println("DONE\n\n");
					done.add(urls.get(current));
				} else {
					System.out.println("THE YOUTUBE ALREADY DOWNLOADED: "
							+ urls.get(current));
				}
			}
		}
		System.out.println("DOWNLOAD COMPLETED");
	}

	public static void downloadedYoutube() {
		done.add("https://www.youtube.com/watch?v=LLOxLQ_ztcg");
done.add("https://www.youtube.com/watch?v=TwR6IJqXQb8");
		done.add("https://www.youtube.com/watch?v=NTk7SOPPmHI");
		done.add("https://www.youtube.com/watch?v=Zwnzw1bceaQ");
		done.add("https://www.youtube.com/watch?v=BIHnCfLBx-o");
		done.add("https://www.youtube.com/watch?v=x55Ge49MlrM");

		done.add("https://www.youtube.com/watch?v=reB28FCJ8aI");
		done.add("https://www.youtube.com/watch?v=gksDiiUqEWE");
		done.add("https://www.youtube.com/watch?v=VASPRy6VQ-c");
		done.add("https://www.youtube.com/watch?v=GZVkTm4ZNj0");
		done.add("https://www.youtube.com/watch?v=uyzifBF6h1w");

		done.add("https://www.youtube.com/watch?v=t3p_L2Wrqkk");
		done.add("https://www.youtube.com/watch?v=pk2uLmT9068");
		done.add("https://www.youtube.com/watch?v=Q-l2P-b5z2s");
		done.add("https://www.youtube.com/watch?v=7LNqmENS0jw");
		done.add("https://www.youtube.com/watch?v=nheEQhNrhFU");

		done.add("https://www.youtube.com/watch?feature=player_detailpage&v=qPFhRwsLuwk&list=PLbbzpd5Snicz5Moi9lrQ-AirXiInnOFPB");
		done.add("https://www.youtube.com/watch?v=ldvoJe-8WwU");
		done.add("https://www.youtube.com/watch?v=7S-WlOWnRIc&list=PL2B48F21B556F3ED2&index=2");
		done.add("https://www.youtube.com/watch?v=qZKK9kv0pbI&list=PL2B48F21B556F3ED2&index=3");
		done.add("https://www.youtube.com/watch?v=5JkSjOFP5Zk&list=PL2B48F21B556F3ED2&index=4");
		done.add("https://www.youtube.com/watch?v=7zPDXdSDG1o&list=PL2B48F21B556F3ED2&index=5");
		done.add("https://www.youtube.com/watch?v=9rwosGkfdn8&list=PL2B48F21B556F3ED2&index=6");
		done.add("https://www.youtube.com/watch?v=VtbigWZr0bA&list=PL2B48F21B556F3ED2&index=7");
		done.add("https://www.youtube.com/watch?v=7dMBKgSlUPg&list=PL2B48F21B556F3ED2&index=8");
		done.add("https://www.youtube.com/watch?v=mWvGBxYBpSs&list=PL2B48F21B556F3ED2&index=9");
		done.add("https://www.youtube.com/watch?v=5eh2NU0mjrc&list=PL2B48F21B556F3ED2&index=10");
		done.add("https://www.youtube.com/watch?v=x-1MQij1bK8&list=PL2B48F21B556F3ED2&index=11");
		done.add("https://www.youtube.com/watch?v=OiQ_Af8yDXY&list=PL2B48F21B556F3ED2&index=12");
		done.add("https://www.youtube.com/watch?v=8wICQiGdNR4&list=PL2B48F21B556F3ED2&index=13");
		done.add("https://www.youtube.com/watch?v=EeFGbJyb1LI&list=PL2B48F21B556F3ED2&index=14");
		done.add("https://www.youtube.com/watch?v=PqjlXhPoTi0&list=PL2B48F21B556F3ED2&index=15");
		done.add("https://www.youtube.com/watch?v=ZWdeKUZoGrs&list=PL2B48F21B556F3ED2&index=16");
		done.add("https://www.youtube.com/watch?v=QLuglURnyIQ&list=PL2B48F21B556F3ED2&index=17");
		done.add("https://www.youtube.com/watch?v=Q_PHO-SFWos&list=PL2B48F21B556F3ED2&index=18");
		done.add("https://www.youtube.com/watch?v=ZwfsP55mMqE&list=PL2B48F21B556F3ED2&index=19");
		done.add("https://www.youtube.com/watch?v=M6lirThNnkg&list=PL2B48F21B556F3ED2&index=20");
		done.add("https://www.youtube.com/watch?v=5lTWtDh-SB4&list=PL2B48F21B556F3ED2&index=21");
		done.add("https://www.youtube.com/watch?v=QpWKBBDyiqo&list=PL2B48F21B556F3ED2&index=22");
		done.add("https://www.youtube.com/watch?v=-2k_Mtj5710&list=PL2B48F21B556F3ED2&index=23");
		done.add("https://www.youtube.com/watch?v=S8TnKrUuyJc&list=PL2B48F21B556F3ED2&index=24");
		done.add("https://www.youtube.com/watch?v=ZaNNw-btodQ&list=PL2B48F21B556F3ED2&index=25");
		done.add("https://www.youtube.com/watch?v=hoK6weQE2xQ&list=PL2B48F21B556F3ED2&index=26");
		done.add("https://www.youtube.com/watch?v=iXWUm25ns-0&list=PL2B48F21B556F3ED2&index=27");
		done.add("https://www.youtube.com/watch?v=teIj7fak6eU&list=PL2B48F21B556F3ED2&index=28");
		done.add("https://www.youtube.com/watch?v=8qRjY8KO2Cs&list=PL2B48F21B556F3ED2&index=29");
		done.add("https://www.youtube.com/watch?v=-hFazOSjWwA&list=PL2B48F21B556F3ED2&index=30");
		done.add("https://www.youtube.com/watch?v=niUbqgcEfls&list=PL2B48F21B556F3ED2&index=31");
		done.add("https://www.youtube.com/watch?v=BBBymzF8hoI&list=PL2B48F21B556F3ED2&index=32");
		done.add("https://www.youtube.com/watch?v=oi5wlyQ3hmk&list=PL2B48F21B556F3ED2&index=33");
		done.add("https://www.youtube.com/watch?v=9Cy0Mn0FS9M&list=PL2B48F21B556F3ED2&index=34");
		done.add("https://www.youtube.com/watch?v=pjokVI0LJzw&list=PL2B48F21B556F3ED2&index=35");
		done.add("https://www.youtube.com/watch?v=D64WsYWmsDo&list=PL2B48F21B556F3ED2&index=36");
		done.add("https://www.youtube.com/watch?v=GYvr39FZctg&list=PL2B48F21B556F3ED2&index=38");
		done.add("https://www.youtube.com/watch?v=YT5DnTKm3YE&list=PL2B48F21B556F3ED2&index=39");
		done.add("https://www.youtube.com/watch?v=OJsz_YbBvIQ&list=PL2B48F21B556F3ED2&index=40");
		done.add("https://www.youtube.com/watch?v=88oIyrxUX7o&list=PL2B48F21B556F3ED2&index=41");
		done.add("https://www.youtube.com/watch?v=p6QUQvmKnfk&list=PL2B48F21B556F3ED2&index=42");
		done.add("https://www.youtube.com/watch?v=uXOYRyQrRCk&list=PL2B48F21B556F3ED2&index=43");
		done.add("https://www.youtube.com/watch?v=WPkdyWIJSuM&list=PL2B48F21B556F3ED2&index=44");
		done.add("https://www.youtube.com/watch?v=mTugskq7DQY&list=PL2B48F21B556F3ED2&index=45");

		done.add("https://www.youtube.com/watch?v=rLYHFGo6L-U");
		done.add("https://www.youtube.com/watch?v=eNjNqzWyf_Q");
		done.add("https://www.youtube.com/watch?v=KhF9YyoVj9o");
		done.add("https://www.youtube.com/watch?v=oAV6m2PeiVA");
		done.add("https://www.youtube.com/watch?v=6Bek_an4fio");
		done.add("https://www.youtube.com/watch?v=jeURETLKf68");
		done.add("https://www.youtube.com/watch?v=5HWPDs7WFdA");
		done.add("https://www.youtube.com/watch?v=RqxsqOLsEK8");
		done.add("https://www.youtube.com/watch?v=Mw_E6jyF7nQ");
		done.add("https://www.youtube.com/watch?v=b4GzcVSPT4Q");
		done.add("https://www.youtube.com/watch?v=z696cXpFJ4U");
		done.add("https://www.youtube.com/watch?v=mkvbhJGsNQk&list=PL1F29B62FB9156A67");
		done.add("https://www.youtube.com/watch?v=4FBleCag8zc");
		done.add("https://www.youtube.com/watch?feature=player_detailpage&v=hoHCQboEyMA");
		done.add("https://www.youtube.com/watch?v=gzKbH0sFHe4");
		done.add("https://www.youtube.com/watch?v=eQmP9pC7okY");
		done.add("https://www.youtube.com/watch?v=og1esk_CJ1w");
		done.add("https://www.youtube.com/watch?v=Ul3nQsM-Hmc");
		done.add("https://www.youtube.com/watch?v=hM3tGMTUQqg");
		done.add("https://www.youtube.com/watch?v=pwUy9lf8zgs");
		done.add("https://www.youtube.com/watch?v=MNVGXfsF504");
		done.add("https://www.youtube.com/watch?v=8vnNE-FB8vM");
		done.add("https://www.youtube.com/watch?v=zQpcJ46mDFk");
		done.add("https://www.youtube.com/watch?v=6afvPPSM90c");
		done.add("https://www.youtube.com/watch?v=i5BBpBLQIbY");
		done.add("https://www.youtube.com/watch?v=pk12mwbd-Lk");
		done.add("https://www.youtube.com/watch?v=NHt6Ow3sdhM");
		done.add("https://www.youtube.com/watch?v=_TaQBmq31gU");
		done.add("https://www.youtube.com/watch?v=T5lJBIcEgMM");
		done.add("https://www.youtube.com/watch?v=f816QmaGyrE");
		done.add("https://www.youtube.com/watch?v=W3PaS3YZFzw");
		done.add("https://www.youtube.com/watch?v=Yum5J3L-85g");
		done.add("https://www.youtube.com/watch?v=nIS3mPGpfSU");
		done.add("https://www.youtube.com/watch?v=LAgpWInHIMU");
		done.add("https://www.youtube.com/watch?v=V2O8JtuX2Ys");
		done.add("https://www.youtube.com/watch?v=sMIWCBaDD0E");
		done.add("https://www.youtube.com/watch?v=tBSAvHaSico");
		done.add("https://www.youtube.com/watch?v=JVu8sk4IHw4");
		done.add("https://www.youtube.com/watch?v=cH2IblkLsgY");
		done.add("https://www.youtube.com/watch?v=i-2_xn_wH14");
		done.add("https://www.youtube.com/watch?v=b7RKBQaGVQQ");
		done.add("https://www.youtube.com/watch?v=FM2GhG-e9CQ");
		done.add("https://www.youtube.com/watch?v=GZA-jX8Bh04");
		done.add("https://www.youtube.com/watch?v=v5fgggrMwS4");
		done.add("https://www.youtube.com/watch?v=ZfBA6dFjyV8");
		done.add("https://www.youtube.com/watch?v=0acgpr42B9A");
		done.add("https://www.youtube.com/watch?v=joR6vyeeaMM");
		done.add("https://www.youtube.com/watch?v=Zy1DWIZwk8o");
		done.add("https://www.youtube.com/watch?v=UI4NVflm-zk");
		done.add("https://www.youtube.com/watch?v=j2Jgz6m4doA");
		done.add("https://www.youtube.com/watch?v=u7tEJq1l990");
		done.add("https://www.youtube.com/watch?v=l7BdIWeHQow");
		done.add("https://www.youtube.com/watch?v=dLJ2a6gp8Og");
		done.add("https://www.youtube.com/watch?v=LOK1sJV5Sw0");
		done.add("https://www.youtube.com/watch?v=NFM4WB1sVhU");
		done.add("https://www.youtube.com/watch?v=YBR5ZC82E8Y");
		done.add("https://www.youtube.com/watch?v=RKKpZOwKPA4");
		done.add("https://www.youtube.com/watch?v=WthNwxFexQc");
		done.add("https://www.youtube.com/watch?v=VD1Ghk7POb4");
		done.add("https://www.youtube.com/watch?v=a0an7vfbe3s");
		done.add("https://www.youtube.com/watch?v=W4vR4unTARs");
		done.add("https://www.youtube.com/watch?v=icmd_IUNRAw");
		done.add("https://www.youtube.com/watch?v=Oj5zsZ_Z7Ro");
		done.add("https://www.youtube.com/watch?v=dFYw9VBWIZ0");
		done.add("https://www.youtube.com/watch?v=8Vr-8AB7jGE");
		done.add("https://www.youtube.com/watch?v=NFM4WB1sVhU&list=PL8287FCBE2B990D57&index=19");
		done.add("https://www.youtube.com/watch?v=glduYXfQIFw&list=PL8287FCBE2B990D57&index=25");
		done.add("https://www.youtube.com/watch?v=pRE7pG4snrA&list=PL8287FCBE2B990D57&index=26");
		done.add("https://www.youtube.com/watch?v=32spZU-U52U&list=PL8287FCBE2B990D57&index=27");
		done.add("https://www.youtube.com/watch?v=PvCtHDTrGGU&list=PL8287FCBE2B990D57&index=28");
		done.add("https://www.youtube.com/watch?v=giVecL2ANv8&list=PL8287FCBE2B990D57&index=29");
		done.add("https://www.youtube.com/watch?v=FEl6GHeTT1c&list=PL8287FCBE2B990D57&index=30");
		done.add("https://www.youtube.com/watch?v=B6Wm9flHrTs&list=PL8287FCBE2B990D57&index=31");
		done.add("https://www.youtube.com/watch?v=cH2IblkLsgY&list=PL8287FCBE2B990D57&index=33");
		done.add("https://www.youtube.com/watch?v=b7RKBQaGVQQ&list=PL8287FCBE2B990D57&index=36");
		done.add("https://www.youtube.com/watch?v=NuRyRFUdQeY&list=PL8287FCBE2B990D57&index=37");
		done.add("https://www.youtube.com/watch?v=O19hW7MX3TQ&list=PL8287FCBE2B990D57&index=5");
		done.add("https://www.youtube.com/watch?v=v5fgggrMwS4&list=PL8287FCBE2B990D57&index=6");
		done.add("https://www.youtube.com/watch?v=-IPKPz1pujM&list=PL8287FCBE2B990D57&index=7");
		done.add("https://www.youtube.com/watch?v=sMIWCBaDD0E&list=PL8287FCBE2B990D57&index=8");
		done.add("https://www.youtube.com/watch?v=GZA-jX8Bh04&list=PL8287FCBE2B990D57&index=9");
		done.add("https://www.youtube.com/watch?v=xHFPL4H7rhM&list=PL8287FCBE2B990D57&index=10");
		done.add("https://www.youtube.com/watch?v=vj16XRckyhE&list=PL8287FCBE2B990D57&index=11");
		done.add("https://www.youtube.com/watch?v=SvA_cSuJS0I&list=PL8287FCBE2B990D57&index=12");
		done.add("https://www.youtube.com/watch?v=iqae7UUdoXk&list=PL8287FCBE2B990D57&index=13");
		done.add("https://www.youtube.com/watch?v=tBSAvHaSico&list=PL8287FCBE2B990D57&index=14");
		done.add("https://www.youtube.com/watch?v=i-2_xn_wH14&list=PL8287FCBE2B990D57&index=15");
		done.add("https://www.youtube.com/watch?v=2q6hazpU_7Q&list=PL8287FCBE2B990D57&index=17");
		done.add("https://www.youtube.com/watch?v=Fnqa2_I3gAM&list=PL8287FCBE2B990D57&index=18");
		done.add("https://www.youtube.com/watch?v=j2Jgz6m4doA&list=PL8287FCBE2B990D57&index=20");
		done.add("https://www.youtube.com/watch?v=UI4NVflm-zk&list=PL8287FCBE2B990D57&index=21");
		done.add("https://www.youtube.com/watch?v=7c1MhrgtrlY&list=PL8287FCBE2B990D57&index=2");
		done.add("https://www.youtube.com/watch?v=FM2GhG-e9CQ&list=PL8287FCBE2B990D57&index=3");
		done.add("https://www.youtube.com/watch?v=0VtDV_ojP6k&list=PL8287FCBE2B990D57&index=4");
		done.add("https://www.youtube.com/watch?v=rVvlxQT8PTs&list=PLE2267E3374F5A0B3");
		done.add("https://www.youtube.com/watch?v=LXre-G2FaTM&list=PLE2267E3374F5A0B3");
		done.add("https://www.youtube.com/watch?v=fi-uTHQmBX8&list=PLE2267E3374F5A0B3");
		done.add("https://www.youtube.com/watch?v=s_K3gUewCeo&list=PLE2267E3374F5A0B3");
		done.add("https://www.youtube.com/watch?v=nHFs-2_iDsA&list=PLE2267E3374F5A0B3");
		done.add("https://www.youtube.com/watch?v=g6mimugGVSY&list=PLE2267E3374F5A0B3");
		done.add("https://www.youtube.com/watch?v=8z7VReiGSC4");
		done.add("https://www.youtube.com/watch?v=oUpzwQbOKZ0");
		done.add("https://www.youtube.com/watch?v=QqQ8kdkk0Gg");
		done.add("https://www.youtube.com/watch?v=FkL8j0wIRf8");
		done.add("https://www.youtube.com/watch?v=BPvpU0MYeoI");
		done.add("https://www.youtube.com/watch?v=ifeIHLoe7QQ");
		done.add("https://www.youtube.com/watch?v=QTM2xjYMclU&index=6&list=PLD2793BD8711741EE");
		done.add("https://www.youtube.com/watch?v=qRV0Eo5T5ko");
		done.add("https://www.youtube.com/watch?v=85IrAbBjK3c&list=PLWUvWgxGsU5U0TINPU1MLz4GC_1uucDUN&index=5");
		done.add("https://www.youtube.com/watch?v=-QjKxdiV_C4&list=PLWUvWgxGsU5U0TINPU1MLz4GC_1uucDUN&index=3");
		done.add("https://www.youtube.com/watch?v=XEXGv88KQYo&list=PLWUvWgxGsU5U0TINPU1MLz4GC_1uucDUN&index=4");
		done.add("https://www.youtube.com/watch?v=KBPAI6qLW5o&feature=c4-overview-vl&list=PLWUvWgxGsU5VohKG1903PWt89CeOU03XS");
		done.add("https://www.youtube.com/watch?v=2IVR8BrUESQ&feature=c4-overview-vl&list=PLWUvWgxGsU5VohKG1903PWt89CeOU03XS");
		done.add("https://www.youtube.com/watch?v=P1H6iODKUsY");
		done.add("https://www.youtube.com/watch?v=J4KjqV7_cWA");

	}

	VideoInfo info;
	long last;
	static int current;
	static ArrayList<String> done = new ArrayList<String>();
	static int prePercent = -1;
	static int retryCount = 0;

	public void run(String url, File path) {
		try {
			AtomicBoolean stop = new AtomicBoolean(false);
			Runnable notify = new Runnable() {
				@Override
				public void run() {
					VideoInfo i1 = info;
					DownloadInfo i2 = i1.getInfo();

					// notify app or save download state
					// you can extract information from DownloadInfo info;
					switch (i1.getState()) {
					case EXTRACTING:
					case EXTRACTING_DONE:
					case DONE:
						System.out.println(i1.getState() + " "
								+ i1.getVideoQuality());
						break;
					case RETRYING:
						System.out.println(i1.getState() + " " + i1.getDelay());
						retryCount++;
						if(retryCount > 20)
							return; //throw new Exception();
						break;
					case DOWNLOADING:
						long now = System.currentTimeMillis();
						if (now - 1000 > last) {
							last = now;

							String parts = "";

							List<Part> pp = i2.getParts();
							if (pp != null) {
								for (Part p : pp) {
									if (p.getState().equals(States.DOWNLOADING)) {
										parts += String
												.format("Part#%d(%.2f) ",
														p.getNumber(),
														p.getCount()
																/ (float) p
																		.getLength());
									}
								}
							}

							int percentage = (int) ((i2.getCount() / (float) i2
									.getLength()) * 100);
							if (!(prePercent == percentage)) {
								if ((percentage + 1) % 20 == 0)
									System.out.println(String.format(percentage
											+ " "));
								else
									System.out.print(String.format(percentage
											+ " "));
								prePercent = percentage;
								/*
								 * System.out.print("\r DOWNLOADED: " +
								 * percentage + "%"); prePercent = percentage;
								 */
							}
						}
						break;
					default:
						break;
					}
				}
			};

			info = new VideoInfo(new URL(url));

			VideoInfoUser user = new VideoInfoUser();
			VGet v = new VGet(info, path);

			v.extract(user, stop, notify);
			System.out.println(info.getTitle());

			v.download(user, stop, notify);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}