function showProfile(id) {
	let profileSection = document.getElementById("profileSelect");
	profileSection.style.animation = "fadeOut 0.5s ease forwards";

	setTimeout(() => {
			profileSection.style.display = 'none';
			document.querySelector('main').style.display = 'block';

			document.querySelectorAll('.member').forEach(section => {
				section.classList.remove('active');
				section.style.display = 'none';
			});

			let activeProfile = document.getElementById(id);
			activeProfile.style.display = 'block';
			activeProfile.classList.add('active');
		}

		, 500);
}

function refreshScreen() {
	let profileSection = document.getElementById("profileSelect");
	profileSection.style.animation = "fadeIn 0.5s ease forwards";

	setTimeout(() => {
			profileSection.style.display = 'block';
			document.querySelector('main').style.display = 'none';

			document.querySelectorAll('.member').forEach(section => {
				section.classList.remove('active');
				section.style.display = 'block';
			});
		}

		, 500);
	document.querySelector('main').style.display = 'block';
}
