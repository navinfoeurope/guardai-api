# Adversarial Security Assessment Platform for AI API

## API Guide
In general, using the ASAP API consists of the following high level steps:
1. Creating API credentials

   Go to the Profile page

   <img style="float: left;" src="images/profilemenu.jpg" alt="Image of menu" height="300"/>

   Click on the key icon to create a new API key.

   <img style="float: left;" src="images/createapikey.jpg" alt="Image of profile page" width="400"/>

2. Setting up the API client

   Using the API key created in step 1, create an API client for your chosen language, for example in Python:
   ```python
    ...
    config = load_sdk_config()
    auth_token = get_auth_token(config['connection']['host'],
                                config['connection']['api-key'], config['connection']['api-key-id'])
    api_client = get_api_client(config['connection']['host'], auth_token)
    ...
   ```
3. Use the api client to make API calls:
   ```python
    project_api = ProjectApi(api_client)
    print('Listing projects...')
    projects = project_api.get_projects()
    ...
   ```

## API Examples
[Python examples](python/README.md#Running-the-example-code)

## API Reference Documentation
[HTML Documentation](https://htmlpreview.github.io/?https://github.com/navinfoeurope/asap-api/blob/master/docs/index.html)

[Python API client documentation](python/asap_api/README.md#Documentation-for-API-Endpoints)
