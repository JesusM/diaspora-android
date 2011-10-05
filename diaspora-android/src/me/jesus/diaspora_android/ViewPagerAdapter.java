package me.jesus.diaspora_android;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.LinearLayout.LayoutParams;

import com.jakewharton.android.viewpagerindicator.TitleProvider;

public class ViewPagerAdapter extends PagerAdapter implements TitleProvider {
	private String[] titles;

	private final Context context;

	public ViewPagerAdapter(Context context) {
		this.context = context;
		titles = cargarPaginas();
	}

	public ViewPagerAdapter(Context context, String[] titles) {
		this.context = context;
		this.titles = titles;
	}

	private String[] cargarPaginas() {
		// TODO Auto-generated method stub

		return new String[] { "All aspects", "Friends", "Family" };
	}

	@Override
	public String getTitle(int position) {
		return titles[position];
	}

	@Override
	public int getCount() {
		return titles.length;
	}

	@Override
	public Object instantiateItem(View pager, int position) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View layout = null;
		switch (position) {
		case 0:
			layout = inflater.inflate(R.layout.inbox, null);
			cargarComentarios(layout);
			break;
		case 1:
			layout = inflater.inflate(R.layout.inbox, null);
			cargarComentarios(layout);
			break;
		case 2:
			layout = inflater.inflate(R.layout.inbox, null);
			cargarComentarios(layout);
			break;
		}

		((ViewPager) pager).addView(layout, 0);
		return layout;
	}

	@Override
	public void destroyItem(View pager, int position, Object view) {
		((ViewPager) pager).removeView((View) view);
	}

	@Override
	public boolean isViewFromObject(View view, Object object) {
		return view == (View) object;
	}

	@Override
	public void finishUpdate(View view) {
	}

	@Override
	public void restoreState(Parcelable p, ClassLoader c) {
	}

	@Override
	public Parcelable saveState() {
		return null;
	}

	@Override
	public void startUpdate(View view) {
	}

	private void cargarComentarios(View item) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){
			
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View item2 = null;
			item2 = inflater.inflate(R.layout.comment, null);

			ImageView a = (ImageView) item2.findViewById(R.id.PhotoProfile);
			
			//Example load image (or not) depending if arg0%2==0
			if (i%2==0) {
				ImageView b = (ImageView) item2.findViewById(R.id.UploadPhoto);
				b.setImageResource(R.drawable.photo_large);
				a.setImageResource(R.drawable.custom_photo);
			}else{
				a.setImageResource(R.drawable.photo);
			}

			((TextView) item2.findViewById(R.id.NameProfile)).setText("Jesus");
			((TextView) item2.findViewById(R.id.comentario))
					.setText("Finalizado el V Concurso Universitario de Software Libre, "
							+ "tras la fase final en Granada, conociendo a muy buena gente y exponiendo nuestros proyectos, "
							+ "me vuelvo a casa con el orgullo de haber recibido el Premio Especial del Concurso (que se corresponde con el primer premio).");
//			((TextView) item2.findViewById(R.id.comentarioResponses))
//					.setOnClickListener(new OnClickListener() {
//
//						@Override
//						public void onClick(View arg0) {
//							// TODO Auto-generated method stub
//							context.startActivity(new Intent(context,
//									VistaComentarios.class));
////							Toast.makeText(this, , duration)
//						}
//					});
			item2.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					context.startActivity(new Intent(context,
							VistaComentarios.class));
				}});
			((TextView) item2.findViewById(R.id.comentarioSince))
					.setText("hace 2 días");
			((TextView) item2.findViewById(R.id.comentarioResponses))
					.setText("not comment yet");
			LinearLayout rGris = new LinearLayout(context);
			rGris.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT,1));
			rGris.setBackgroundColor(R.color.lightgray);
			
			((LinearLayout)item.findViewById(R.id.comentarios)).addView(item2);
			
			((LinearLayout)item.findViewById(R.id.comentarios)).addView(rGris);
		}
	}
}
